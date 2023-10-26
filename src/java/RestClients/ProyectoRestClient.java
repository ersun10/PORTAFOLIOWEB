/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestClients;

import Config.Config;
import Objects.Proyecto;
import Objects.Tecnologia;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import javax.ws.rs.core.Response;

/**
 *
 * @author luisj
 */
public class ProyectoRestClient {

    private final String pathConfiguracion;
    private final Properties propiedades;
    private final Config config;
    private final String baseUrl;

    // Para la peticion
    private final Client cliente;
    private final WebTarget webTarget;

    public ProyectoRestClient() {
        config = new Config();
        pathConfiguracion = config.getArchivo();
        propiedades = new Properties();
        try {
            propiedades.load(new java.io.FileInputStream(new java.io.File(pathConfiguracion)));
        } catch (Exception ex) {
            Logger.getLogger(InformacionRestClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        baseUrl = "http://" + propiedades.getProperty("ip") + ":" + propiedades.getProperty("puerto") + propiedades.getProperty("base");

        cliente = ClientBuilder.newClient();
        webTarget = cliente.target(baseUrl).path("proyectos");
    }

    public List<Proyecto> getAll() {
        List<Proyecto> lista = new ArrayList<>();
        WebTarget resource = webTarget;
        try {
            lista = resource.request(APPLICATION_JSON).get(Response.class).readEntity(new GenericType<List<Proyecto>>() {
            });
        } catch (NullPointerException ex) {
        }
        return lista;
    }

    public Proyecto getById(int id) {
        Proyecto proyecto = new Proyecto();
        WebTarget resource = cliente.target(baseUrl).path("proyectos/" + id);
        try {
            proyecto = resource.request(APPLICATION_JSON).get(Response.class).readEntity(new GenericType<Proyecto>() {
            });
        } catch (NullPointerException ex) {
        }
        return proyecto;
    }

    public List<Tecnologia> getTecnologias(int idProyecto) {
        List<Tecnologia> lista = new ArrayList<>();
        try {
            WebTarget resource = cliente.target(baseUrl).path("proyectos/TecByPro").queryParam("idProyecto", idProyecto);
            lista = resource.request(APPLICATION_JSON).get(Response.class).readEntity(new GenericType<List<Tecnologia>>() {
            });
        } catch (NullPointerException ex) {
        }
        return lista;
    }

}

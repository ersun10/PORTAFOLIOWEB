/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestClients;

import Config.Config;
import Objects.Experiencia;
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
public class ExperienciaRestClient {
    
    private final String pathConfiguracion;
    private final Properties propiedades;
    private final Config config;
    private final String baseUrl;

    // Para la peticion
    private final Client cliente;
    private final WebTarget webTarget;
    
    public ExperienciaRestClient(){
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
        webTarget = cliente.target(baseUrl).path("experiencias");
    }
    
    public List<Experiencia> getAll(){
        List<Experiencia> lista = new ArrayList<>();
        WebTarget resource = webTarget;
        lista = resource.request(APPLICATION_JSON).get(Response.class).readEntity(new GenericType<List<Experiencia>>(){});
        return lista;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestClients;

import Config.Config;
import Objects.Informacion;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author luisj
 */
public class InformacionRestClient {

    private final String pathConfiguracion;
    private final Properties propiedades;
    private final Config config;
    private final String baseUrl;

    // Para la peticion
    private final Client cliente;
    private final WebTarget webTarget;

    public InformacionRestClient() {
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
        webTarget = cliente.target(baseUrl).path("informacion");
    }

    public Informacion getInfo() {
        WebTarget resource = webTarget;
        Informacion info = new Informacion();
        try {
            info = resource.request(MediaType.APPLICATION_JSON).get(Informacion.class);
        } catch (NullPointerException ex) {
        }
        return info;
    }

}

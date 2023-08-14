/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Beans;

import Objects.Experiencia;
import RestClients.ExperienciaRestClient;
import java.util.List;

/**
 *
 * @author luisj
 */
public class ExperienciasManagedBean {

    /**
     * Creates a new instance of ExperienciasManagedBean
     */
    
    private final ExperienciaRestClient client;
    
    public ExperienciasManagedBean() {
        client = new ExperienciaRestClient();
    }
    
    public List<Experiencia> getAll(){
        return client.getAll();
    }
    
}

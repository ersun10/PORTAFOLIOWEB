/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Beans;

import Objects.Proyecto;
import RestClients.ProyectoRestClient;
import java.util.List;

/**
 *
 * @author luisj
 */
public class ProyectosManagedBean {

    private final ProyectoRestClient client;
    
    public ProyectosManagedBean() {
        client = new ProyectoRestClient();
    }
    
    public List<Proyecto> getAll(){
        return this.client.getAll();
    }
}

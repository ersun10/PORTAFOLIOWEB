/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Beans;

import Objects.Formacion;
import RestClients.FormacionRestClient;
import java.util.List;

/**
 *
 * @author luisj
 */
public class FormacionManagedBean {

    private final FormacionRestClient client;
    
    public FormacionManagedBean() {
        client = new FormacionRestClient();
    }
    
    public List<Formacion> getAll(){
        return this.client.getAll();
    }
    
}

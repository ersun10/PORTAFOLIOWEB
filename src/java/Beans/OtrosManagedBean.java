/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Beans;

import Objects.Otro;
import RestClients.OtroRestClient;
import java.util.List;

/**
 *
 * @author luisj
 */
public class OtrosManagedBean {

    private final OtroRestClient client;
    
    public OtrosManagedBean() {
        client = new OtroRestClient();
    }
    
    public List<Otro> getAll(){
        return this.client.getAll();
    }
    
}

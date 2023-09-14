/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Beans;

import Objects.Tecnologia;
import RestClients.TecnologiaRestClient;
import java.util.List;

/**
 *
 * @author luisj
 */
public class TecnologiasManagedBean {

    private final TecnologiaRestClient client;
    
    public TecnologiasManagedBean() {
        client = new TecnologiaRestClient();
    }
    
    public List<Tecnologia> getAll(){
        return this.client.getAll();
    }
    
}

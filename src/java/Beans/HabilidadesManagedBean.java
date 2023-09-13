/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Beans;

import Objects.Habilidad;
import RestClients.HabilidadRestClient;
import java.util.List;

/**
 *
 * @author luisj
 */
public class HabilidadesManagedBean {
    
    private final HabilidadRestClient client; 
    
    public HabilidadesManagedBean() {
        client = new HabilidadRestClient();
    }
    
    public List<Habilidad> getAll(){
        return this.client.getAll();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Beans;

import Objects.Informacion;
import RestClients.InformacionRestClient;

public class InformacionManagedBean {

    /**
     * Creates a new instance of InformacionManagedBean
     */
    private final InformacionRestClient client;

    public InformacionManagedBean() {
        client = new InformacionRestClient();
    }
    
    public Informacion getInfo(){
        return client.getInfo();
    }

    public String getObjetivos() {
        return getInfo().getObjetivos();
    }

    public String getNombre() {
        return getInfo().getNombre();
    }

    public String getNacionalidad() {
        return getInfo().getNacionalidad();
    }

    public String getEmail() {
        return getInfo().getEmail();
    }

    public String getDni() {
        return getInfo().getDni();
    }

    public String getFechaNacimiento() {
        return getInfo().getFechaNacimiento();
    }

    public String getLocalidad() {
        return getInfo().getLocalidad();
    }

    public int getTelefono() {
        return getInfo().getTelefono();
    }
}

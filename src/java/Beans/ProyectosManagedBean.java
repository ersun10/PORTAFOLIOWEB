/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Beans;

import Objects.Imagen;
import Objects.Proyecto;
import RestClients.ProyectoRestClient;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisj
 */
public class ProyectosManagedBean {

    private final ProyectoRestClient client;

    private String nombre;
    private String descripcion;
    private String tipo;
    private String carpetaImagenes;

    public ProyectosManagedBean() {
        client = new ProyectoRestClient();
    }

    public List<Proyecto> getAll() {
        return this.client.getAll();
    }

    public Proyecto getById(int id) {
        this.nombre = this.client.getById(id).getNombre();
        this.descripcion = this.client.getById(id).getDescripcion();
        this.tipo = this.client.getById(id).getTipo();
        this.carpetaImagenes = this.client.getById(id).getCarpetaImagenes();
        return this.client.getById(id);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCarpetaImagenes() {
        return carpetaImagenes;
    }

}

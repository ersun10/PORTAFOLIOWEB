/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Beans;

import Objects.Habilidad;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author luisj
 */
public class HabilidadesManagedBean {
    
    /**
     * Creates a new instance of HabilidadesManagedBean
     */
    public HabilidadesManagedBean() {
    }
    
    public List<Habilidad> getAll(){
        List<Habilidad> lista = new ArrayList<>();
        return lista;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Beans;

import Objects.Imagen;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author luisj
 */
public class ImagenesManagedBean {

    public ImagenesManagedBean() {

    }

    public List<Imagen> getImagenes(String ruta, String proyecto) {
        List<Imagen> listaImagenes = new ArrayList<>();
        try {
            File micarpeta = new File(ruta + "resources/Imagenes/Proyectos/" + proyecto);
            String[] contenido = micarpeta.list();
            Arrays.sort(contenido);
            for (String archivo : contenido) {
                listaImagenes.add(new Imagen(proyecto + "/" + archivo));
            }
        } catch (Exception ex) {
        }

        return listaImagenes;
    }

}

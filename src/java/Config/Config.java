/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisj
 */
public class Config {
    
    private final Properties propiedades;
    private final String archivo;
    private final String rootPath;
    
    public Config(){
        rootPath = this.getClass().getResource("").getPath();
        archivo = rootPath + "configuracion.properties";
        propiedades = new Properties();
        try {
            propiedades.load(new FileInputStream(new File(archivo)));
        } catch (Exception ex) {
            System.out.println("Archivo no encontrado");
        }
    }

    public String getArchivo() {
        return archivo;
    }
    
  }

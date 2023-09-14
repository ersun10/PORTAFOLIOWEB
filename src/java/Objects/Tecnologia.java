/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author luisj
 */
public class Tecnologia implements java.io.Serializable {

    private Integer id;
    private String nombre;
    private String nivel;
    private String imagen;

    public Tecnologia() {
    }

    public Tecnologia(Integer id, String nombre, String nivel, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.imagen = imagen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author luisj
 */
public class Proyecto {

    private Integer id;
    private String nombre;
    private String descripcion;
    private String tipo;
    private String carpetaImagenes;

    public Proyecto() {
    }

    public Proyecto(Integer id, String nombre, String descripcion, String tipo, String carpetaImagenes) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.carpetaImagenes = carpetaImagenes;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCarpetaImagenes() {
        return carpetaImagenes;
    }

    public void setCarpetaImagenes(String carpetaImagenes) {
        this.carpetaImagenes = carpetaImagenes;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}

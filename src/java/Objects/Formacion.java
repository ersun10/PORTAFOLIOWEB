package Objects;

public class Formacion implements java.io.Serializable {

    private Integer id;
    private String titulo;
    private String centro;
    private String localidad;
    private String fechaIni;
    private String fechaFin;

    public Formacion() {
    }

    public Formacion(Integer id, String titulo, String centro, String localidad, String fechaIni, String fechaFin) {
        this.id = id;
        this.titulo = titulo;
        this.centro = centro;
        this.localidad = localidad;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return this.titulo;
    }
}

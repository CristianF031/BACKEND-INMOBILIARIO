package co.edu.usbcali.inmobiliaria.model;

public class TipoPropiedad {
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdTipoPropiedad() {
        return idTipoPropiedad;
    }

    public void setIdTipoPropiedad(Integer idTipoPropiedad) {
        this.idTipoPropiedad = idTipoPropiedad;
    }

    private Integer idTipoPropiedad;
    private String nombre;
    private String descripcion;
}

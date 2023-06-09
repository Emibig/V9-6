package proyecto.internaciondomiciliaria.entities;

public class Equipo {

    int id_equipo;
    String descripcion;
    int codigo_interno;
    int cantidad;
    public String getCantidad;

    public Equipo() {
    }

    /* constructor sin id equipo */
    public Equipo(String descripcion, int codigo_interno, int cantidad) {
        this.descripcion = descripcion;
        this.codigo_interno = codigo_interno;
        this.cantidad = cantidad;
    }

    public Equipo(int id_equipo, String descripcion, int codigo_interno, int cantidad) {

        this.id_equipo = id_equipo;
        this.descripcion = descripcion;
        this.codigo_interno = codigo_interno;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Equipo [id_equipo=" + id_equipo + ", descripcion=" + descripcion + ", codigo_interno=" + codigo_interno
                + ", cantidad=" + cantidad + "]";
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo_interno() {
        return codigo_interno;
    }

    public void setCodigo_interno(int codigo_interno) {
        this.codigo_interno = codigo_interno;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}

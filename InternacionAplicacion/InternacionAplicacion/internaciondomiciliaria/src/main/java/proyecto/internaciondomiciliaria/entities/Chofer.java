package proyecto.internaciondomiciliaria.entities;

public class Chofer {
    int id_chofer;
    String vehiculo;
    String nombre_chofer;

    public Chofer() {
    }

    /* constructor sin id */
    public Chofer(String vehiculo, String nombre_chofer) {
        this.vehiculo = vehiculo;
        this.nombre_chofer = nombre_chofer;
    }

    public Chofer(int id_chofer, String vehiculo, String nombre_chofer) {
        this.id_chofer = id_chofer;
        this.vehiculo = vehiculo;
        this.nombre_chofer = nombre_chofer;
    }

    public int getId_chofer() {
        return id_chofer;
    }

    public void setId_chofer(int id_chofer) {
        this.id_chofer = id_chofer;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getNombre_chofer() {
        return nombre_chofer;
    }

    public void setNombre_chofer(String nombre_chofer) {
        this.nombre_chofer = nombre_chofer;
    }

}

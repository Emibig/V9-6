package proyecto.internaciondomiciliaria.entities;

public class Paciente {
    private int id_paciente;
    private String nombre;
    private int nro_socio;
    private String cliente;
    private int celular;
    private String calle_altura;
    private String piso_departamento;
    private String entrecalles;
    private String localidad;
    private String zona;

    public Paciente() {
    }

    public Paciente(String nombre, int nro_socio, String cliente, int celular, String calle_altura,
            String piso_departamento, String entrecalles, String localidad, String zona) {
        this.nombre = nombre;
        this.nro_socio = nro_socio;
        this.cliente = cliente;
        this.celular = celular;
        this.calle_altura = calle_altura;
        this.piso_departamento = piso_departamento;
        this.entrecalles = entrecalles;
        this.localidad = localidad;
        this.zona = zona;
    }

    

    public Paciente(int id_paciente, String nombre, int nro_socio, String cliente, int celular, String calle_altura,
            String piso_departamento, String entrecalles, String localidad, String zona) {
        this.id_paciente = id_paciente;
        this.nombre = nombre;
        this.nro_socio = nro_socio;
        this.cliente = cliente;
        this.celular = celular;
        this.calle_altura = calle_altura;
        this.piso_departamento = piso_departamento;
        this.entrecalles = entrecalles;
        this.localidad = localidad;
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Paciente [id_paciente=" + id_paciente + ", nombre=" + nombre + ", nro_socio=" + nro_socio + ", cliente="
                + cliente + ", celular=" + celular + ", calle_altura=" + calle_altura + ", piso_departamento="
                + piso_departamento + ", entrecalles=" + entrecalles + ", localidad=" + localidad + ", zona=" + zona
                + "]";
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNro_socio() {
        return nro_socio;
    }

    public void setNro_socio(int nro_socio) {
        this.nro_socio = nro_socio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCalle_altura() {
        return calle_altura;
    }

    public void setCalle_altura(String calle_altura) {
        this.calle_altura = calle_altura;
    }

    public String getPiso_departamento() {
        return piso_departamento;
    }

    public void setPiso_departamento(String piso_departamento) {
        this.piso_departamento = piso_departamento;
    }

    public String getEntrecalles() {
        return entrecalles;
    }

    public void setEntrecalles(String entrecalles) {
        this.entrecalles = entrecalles;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

}

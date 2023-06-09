package proyecto.internaciondomiciliaria.entities;

import java.util.Date;

import proyecto.internaciondomiciliaria.enums.Horario;

public class Visita {
    private int id_visita;
    private String zona;
    private Date fecha;
    private Horario hora_inicio;
    private Horario hora_fin;
    private String coordinado;
    private String concretado;

    private Chofer chofer;

    public Visita() {
    }

    /* constructor sin id */
    public Visita(String zona, Date fecha, Horario hora_inicio, Horario hora_fin, String coordinado, String concretado,
            Chofer chofer) {
        this.zona = zona;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.coordinado = coordinado;
        this.concretado = concretado;
        this.chofer = chofer;
    }

    public Visita(int id_visita, String zona, Date fecha, Horario hora_inicio, Horario hora_fin, String coordinado,
            String concretado, Chofer chofer) {
        this.id_visita = id_visita;
        this.zona = zona;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.coordinado = coordinado;
        this.concretado = concretado;
        this.chofer = chofer;
    }

    @Override
    public String toString() {
        return "Visita [id_visita=" + id_visita + ", zona=" + zona + ", fecha=" + fecha + ", hora_inicio=" + hora_inicio
                + ", hora_fin=" + hora_fin + ", coordinado=" + coordinado + ", concretado=" + concretado + ", chofer="
                + chofer + "]";
    }

    public int getId_visita() {
        return id_visita;
    }

    public void setId_visita(int id_visita) {
        this.id_visita = id_visita;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Horario getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Horario hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Horario getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(Horario hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getCoordinado() {
        return coordinado;
    }

    public void setCoordinado(String coordinado) {
        this.coordinado = coordinado;
    }

    public String getConcretado() {
        return concretado;
    }

    public void setConcretado(String concretado) {
        this.concretado = concretado;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

}

package proyecto.internaciondomiciliaria.enums;


public enum Horario {
    HORARIO_1("8 a 13 hr"),
    HORARIO_2("11 a 15 hr"),
    HORARIO_3("13 a 17 hr");
    
    private String margen;
    
    private Horario(String margen) {
        this.margen = margen;
    }
    
    public String getMargen() {
        return margen;
    }
   
    
}

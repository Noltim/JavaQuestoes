package entities;

public class Terrestre extends MeioDeTransporte {
    private Integer qtdeRoda;
    private Double potencia;

    

    public Terrestre(Integer qtdeRoda, Double potencia) {
        this.qtdeRoda = qtdeRoda;
        this.potencia = potencia;
    }

    public Terrestre(Integer id, Short ano, String modelo, Double cargaMaxima, Integer qtdeRoda, Double potencia) {
        super(id, ano, modelo, cargaMaxima);
        this.qtdeRoda = qtdeRoda;
        this.potencia = potencia;
    }

    public Integer getQtdeRoda() {
        return qtdeRoda;
    }

    public void setQtdeRoda(Integer qtdeRoda) {
        this.qtdeRoda = qtdeRoda;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    @Override
    public double consumo() {
        return potencia * cargaMaxima * 100;
    }

}

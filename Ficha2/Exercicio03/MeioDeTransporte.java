package entities;

public class MeioDeTransporte {
    private Integer id;
    private Short ano;
    private String modelo;
    public Double cargaMaxima;

    public MeioDeTransporte() {
    }

    public MeioDeTransporte(Integer id, Short ano, String modelo, Double cargaMaxima) {
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getAno() {
        return ano;
    }

    public void setAno(Short ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(Double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double consumo(){
        return 0;
    }
}
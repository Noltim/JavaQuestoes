package entities;

public class Ferramenta extends ItemDeLoja {

    private String categoria;
    private Integer serial;

    public Ferramenta(Integer codigoDoItem, String nomeDoItem, String descricaoDoItem, Double valorDoItem, String categoria, Integer serial) {
        super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
        this.categoria = categoria;
        this.serial = serial;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    @Override
    public Integer getIdentificador() {
        return serial;
    }

    public void separar() {
        System.out.println("Retornando método separar da classe ferramentas!");
    }
    
    public void separa(String valor){
        System.out.println("Retornando método separa da classe ferramentas!");
    }

    
}

package entities;

public class Alimento extends ItemDeLoja {

    private Integer selo;

    public Alimento(Integer codigoDoItem, String nomeDoItem, String descricaoDoItem, Double valorDoItem, Integer selo) {
        super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
        this.selo = selo;
    }

    public Integer getSelo() {
        return selo;
    }

    public void setSelo(Integer selo) {
        this.selo = selo;
    }

    @Override
    public Integer getIdentificador() {
        return selo;
    }

}

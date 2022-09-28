package entities;

public class Arquivos {
    private String nomeDoAquivo;
    private int tamanho;
    private String formato;

    public Arquivos(String nomeDoAquivo, int tamanho, String formato) {
        this.nomeDoAquivo = nomeDoAquivo;
        this.tamanho = tamanho;
        this.formato = formato;
    }

    public String getNomeDoAquivo() {
        return nomeDoAquivo;
    }

    public void setNomeDoAquivo(String nomeDoAquivo) {
        this.nomeDoAquivo = nomeDoAquivo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

}

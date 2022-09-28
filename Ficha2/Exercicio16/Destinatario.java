package entities;

public class Destinatario {
    private int emailDestinatario;

    public Destinatario(int emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    public int getEmailDestinatario() {
        return emailDestinatario;
    }

    public void setEmailDestinatario(int emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    public String buscar() {
        return "retornando método buscar da classe destinatario!";
    }

    public void adicionar() {
        System.out.println("retornando método adicionar da classe destinatario!");
    }

    public void apagar() {
        System.out.println("retornando método apagar da classe destinatario!");
    }

}

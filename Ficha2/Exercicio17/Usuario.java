package entities;

import java.net.URL;
import java.util.ArrayList;

public class Usuario extends Pessoa {
    private String login;
    private String senha;

    public Usuario(String nome, String cpf, URL foto, String email, Disciplina disciplina, ArrayList<Evento> evento,
            ArrayList<Amigo> amigo, String login, String senha) {
        super(nome, cpf, foto, email, disciplina, evento, amigo);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
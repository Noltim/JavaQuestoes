package entities;

import java.net.URL;
import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private URL foto;
    private String email;
    private Disciplina disciplina;

    ArrayList<Evento> evento;
    ArrayList<Amigo> amigo;

    public Pessoa(String nome, String cpf, URL foto, String email, Disciplina disciplina, ArrayList<Evento> evento,
            ArrayList<Amigo> amigo) {
        this.nome = nome;
        this.cpf = cpf;
        this.foto = foto;
        this.email = email;
        this.disciplina = disciplina;
        this.evento = evento;
        this.amigo = amigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public URL getFoto() {
        return foto;
    }

    public void setFoto(URL foto) {
        this.foto = foto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Evento> getEvento() {
        return evento;
    }

    public void setEvento(ArrayList<Evento> evento) {
        this.evento = evento;
    }

    public ArrayList<Amigo> getAmigo() {
        return amigo;
    }

    public void setAmigo(ArrayList<Amigo> amigo) {
        this.amigo = amigo;
    }

}

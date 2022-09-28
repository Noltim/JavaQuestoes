package entities;

public class Usuario {
    private String login;
    private String senha;
    private String permissao;
    private Colaborador colaborador;

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

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    private void editarPerfil() {
        System.out.println("Perfil Editado!");
    }

    private void alterarSenha() {
        System.out.println("Senha Alterada!");
    }

    private void criarUsuario() {
        System.out.println("Usuário Criado!");
    }

    private void apagarUsuario() {
        System.out.println("Usuário Apagado!");
    }
}

package br.com.pedro.sistemaDeUsuarios.util;

public class User {
    private String userName;
    private Email email;
    private TipoUser tipoUsuario;
    private Senha senha;

    public User(String userName, Email email, TipoUser tipoUsuario, Senha senha) {
        this.userName = userName;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
        this.senha = senha;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public TipoUser getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUser tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Senha getSenha() {
        return senha;
    }

    public void setSenha(Senha senha) {
        this.senha = senha;
    }
}
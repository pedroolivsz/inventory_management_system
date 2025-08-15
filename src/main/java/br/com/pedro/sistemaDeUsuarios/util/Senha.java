package br.com.pedro.sistemaDeUsuarios.util;

public class Senha {
    private String valor;
    public Senha(String valorUser) {
        if(valorUser.length() < 4) {
            throw new IllegalArgumentException("Senha inválida.");
        }
        valor = valorUser;
    }
    public String getValor() {
        return valor;
    }
    @Override
    public String toString() {
        return valor;
    }
}

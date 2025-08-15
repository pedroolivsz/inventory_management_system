package br.com.pedro.sistemaDeUsuarios.util;

public class Email {
    private String endereco;

    public Email(String enderecoUser) {
        if(!enderecoUser.matches("^[\\\\w.-]+@[\\\\w.-]+\\\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Email inválido!");
        }
        this.endereco = enderecoUser;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return endereco;
    }
}

package br.com.pedro.sistemaDeUsuarios.util;

public enum TipoUser {
    ADMIN, GERENTE, USUARIO;

    public static TipoUser fromString(String valor) {
        return switch(valor.toLowerCase()) {
            case "admin" -> ADMIN;
            case "gerente" -> GERENTE;
            case "usuario" -> USUARIO;
            default -> throw new IllegalArgumentException("Tipo de usuário inválido.");
        };
    }
}

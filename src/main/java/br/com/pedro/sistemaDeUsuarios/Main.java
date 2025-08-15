package br.com.pedro.sistemaDeUsuarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String usuario = "admin";
        String senha = "admin123";
        Scanner scan = new Scanner(System.in);
        System.out.print("Usuario: ");
        String verificarUser = scan.nextLine();
        System.out.print("Senha: ");
        String verificarSenha = scan.nextLine();

        if(verificarSenha.equals(senha) && verificarUser.equals(usuario)) {
            System.out.println("Login completo. Bem-vindo, " + usuario + "!");
        } else {
            System.out.println("Usuario ou senha incorretos.");
        }
    }


}

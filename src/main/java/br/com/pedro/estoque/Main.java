package br.com.pedro.estoque;

import br.com.pedro.estoque.controller.EstoqueController;
import br.com.pedro.estoque.model.EstoqueFisico;
import br.com.pedro.estoque.util.InputHelper;
import br.com.pedro.estoque.util.RepositorioProduto;
import br.com.pedro.estoque.util.RepositorioProdutoDB;
import br.com.pedro.estoque.view.MenuView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RepositorioProduto REPOSITORIO = new RepositorioProdutoDB();
        EstoqueFisico estoque = new EstoqueFisico(REPOSITORIO);
        Scanner scan = new Scanner(System.in);
        EstoqueController controle = new EstoqueController(estoque);
        int opcao;

        do {
            controle.iniciar();
            MenuView.separador();
            opcao = InputHelper.lerInt("Escolha: ");
            MenuView.separador();
            switch(opcao) {
                case 1 -> controle.adicionarProduto();
                case 2 -> controle.listarProdutos();
                case 3 -> controle.removerProduto();
                case 4 -> controle.editarProduto();
                case 5 -> controle.buscarPorNome();
                case 6 -> controle.valorTotalEstoque();
                case 7 -> controle.ordenarProdutos();
                case 0 -> System.out.println("Encerrando sistema...");
                default -> System.out.println("Opção inválida.");
            }
        } while(opcao!=0);
        scan.close();
    }
}

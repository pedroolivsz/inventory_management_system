package br.com.pedro.estoque.util;

import br.com.pedro.estoque.model.ProdutoFisico;

import java.util.ArrayList;

public interface RepositorioProduto {
    void salvar(ArrayList<ProdutoFisico> produtos);
    ArrayList<ProdutoFisico> carregar();
}

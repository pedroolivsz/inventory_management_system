package br.com.pedro.estoque.model;

public interface EstoqueService {
    void adicionarProduto(String nome, int quantidade, double preco);
    void listarProdutos();
    void removerProduto(int id);
    void editarProduto(int id, String nome, int quantidade, double preco);
    void buscarPorNome(String buscarNome);
    void valorTotalEmEstoque();
    void ordenarPor(int criterio);
}

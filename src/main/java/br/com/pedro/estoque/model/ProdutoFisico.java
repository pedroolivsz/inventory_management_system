package br.com.pedro.estoque.model;

public class ProdutoFisico extends ProdutoBase {
    public ProdutoFisico(int id, String nome, int quantidade, double preco) {
        super(id, nome, quantidade, preco);
    }
    @Override
    public double getValorTotal() {
        return this.getQuantidade()*this.getPreco();
    }
}

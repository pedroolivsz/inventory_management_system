package br.com.pedro.estoque.model;

public abstract class ProdutoBase {
    protected final int id;
    protected String nome;
    protected int quantidade;
    protected double preco;

    public ProdutoBase(int id, String nome, int quantidade, double preco) {
        this.id = id;
        this.setNome(nome);
        this.setQuantidade(quantidade);
        this.setPreco(preco);
    }

    public abstract double getValorTotal();

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()) throw new IllegalArgumentException("O nome não pode estar vazio.");
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade < 0) throw new IllegalArgumentException("A quantidade não pode ser negativa.");
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        if(preco < 0) throw new IllegalArgumentException("O valor não pode ser negativo.");
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("|ID: %d |Nome: %s |Quantidade: %d |Preço unitário: R$%.2f |Valor total: R$%.2f |",
                this.getId(), this.getNome(), this.getQuantidade(), this.getPreco(), this.getValorTotal());
    }
}

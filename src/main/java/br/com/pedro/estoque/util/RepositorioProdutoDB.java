package br.com.pedro.estoque.util;

import br.com.pedro.estoque.model.ProdutoFisico;

import java.sql.*;
import java.util.ArrayList;

public class RepositorioProdutoDB implements RepositorioProduto{
    private final String url = "jdbc:mysql://localhost:3306/estoque_DB";
    private final String user = "root";
    private final String password = "Admin,1408";

    @Override
    public void salvar(ArrayList<ProdutoFisico> produtos) {
        try(Connection conexao = DriverManager.getConnection(url, user, password)) {
        String sql = "REPLACE INTO produtos (id, nome, quantidade, preco) VALUES (?, ?, ?, ?)";
        try(PreparedStatement statement = conexao.prepareStatement(sql)) {
            for(ProdutoFisico produto : produtos) {
                statement.setInt(1, produto.getId());
                statement.setString(2, produto.getNome());
                statement.setInt(3, produto.getQuantidade());
                statement.setDouble(4, produto.getPreco());
                statement.addBatch();
            }
            statement.executeBatch();
        }
        } catch (SQLException sqle) {
            System.out.println("Erro ao salvar dados no MySQL: " + sqle.getMessage());
        }
    }

    @Override
    public ArrayList<ProdutoFisico> carregar() {
        ArrayList<ProdutoFisico> produtos = new ArrayList<>();
        try(Connection conexao = DriverManager.getConnection(url, user, password)) {
            String sql = "SELECT * FROM produtos";
            try(Statement statement = conexao.createStatement()) {
                ResultSet resultado = statement.executeQuery(sql);
                while(resultado.next()) {
                    ProdutoFisico produto = new ProdutoFisico(
                            resultado.getInt("id"),
                            resultado.getString("nome"),
                            resultado.getInt("quantidade"),
                            resultado.getDouble("preco")
                    );
                    produtos.add(produto);
                }
            }
        } catch(SQLException sqle) {
            System.out.println("Erro ao carregar dados do MySQL: " + sqle.getMessage());
        }
        return produtos;
    }
}

package br.com.etec.exerciciojdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.etec.exerciciojdbc.dao.ConnectionFactory;
import br.com.etec.exerciciojdbc.dao.ProdutoDAO;
import br.com.etec.exerciciojdbc.model.Produto;

public class TestaConexao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Connection connection = (Connection) new ConnectionFactory().getConnection();
			System.out.println("Conexão OK");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			}
		
		Produto produto = new Produto();
		produto.setNome("Notebook");
		produto.setDescricao("Caro pra uma desgraça");
		produto.setPreco(30000.00);
		
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.insere(produto);
		System.out.println("Produto adicionado com sucesso!");
		
	}
}

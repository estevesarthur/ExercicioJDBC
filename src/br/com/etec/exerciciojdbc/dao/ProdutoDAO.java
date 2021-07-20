package br.com.etec.exerciciojdbc.dao;

import java.sql.Connection;
import br.com.etec.exerciciojdbc.model.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {
	//Atributo
	private Connection connection;

	public ProdutoDAO() {
		this.connection = new ConnectionFactory().getConnection();

	}

	public void insere(Produto produto) {
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement ("insert into Produto values (?,?,?)");
			ps.setString(1, produto.getNome());
			ps.setString(2, produto.getDescricao());
			ps.setDouble(3, produto.getPreco());
			ps.execute();
			ps.close();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}

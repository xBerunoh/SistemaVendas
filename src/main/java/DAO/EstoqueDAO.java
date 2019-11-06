package DAO;

import JDBC.ConnectionFactory;
import MODEL.Estoque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EstoqueDAO {
    private Connection connection;
    
	public EstoqueDAO() {
		this.connection = new ConnectionFactory().getConnection();

	}
public void adiciona(Estoque estoque ){
		String sql = "insert into estoque" + "(descricao,preco,quantidade)" + "values (?,?,?,?)";
		try {
                    PreparedStatement stmt = connection.prepareStatement(sql);

			
                        stmt.setInt(1, estoque.getQuantidade());
                        stmt.setString(2, estoque.getDescricao());
                        stmt.setDouble(3, estoque.getPreco());
                        stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}}
public void altera(Estoque estoque) {
		String sql = "update contato set descricao=?,preco=?,quantidade=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			
			stmt.setString(1, estoque.getDescricao());
			stmt.setDouble(2, estoque.getPreco());
			stmt.setInt(3, estoque.getQuantidade());
			stmt.setInt(4, estoque.getId_produto());

			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "Alterado com sucesso!");

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
public void remove(Estoque estoque) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from estoque where id=?");

			stmt.setInt(1, estoque.getId_produto());
			stmt.execute();
			stmt.close();

			JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
public List<Estoque> getLista() {
		try {

			PreparedStatement stmt = this.connection.prepareStatement("select * from estoque");
			ResultSet rs = stmt.executeQuery();
			List<Estoque> estoques = new ArrayList<Estoque>();
			while (rs.next()) {
				Estoque estoque = new Estoque();
				estoque.setId_produto(rs.getInt("id"));
				estoque.setDescricao(rs.getString("Descrição"));
                                estoque.setPreco(rs.getDouble("Preço"));
                                estoque.setQuantidade(rs.getInt("Quantidade"));

				estoques.add(estoque);
			}
			rs.close();
			stmt.close();
			return estoques;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}







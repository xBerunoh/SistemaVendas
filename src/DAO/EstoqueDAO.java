package DAO;

import JDBC.ConnectionFactory;
import MODEL.Estoque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EstoqueDAO {
    private Connection connection;
    
	public EstoqueDAO() {
		this.connection = new ConnectionFactory().getConnection();

	}
public void adiciona(Estoque estoque ){
		String sql = "insert into estoque" + "(id_produto,descricao,preco,quantidade)" + "values (?,?,?,?)";
		try {
                    PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setInt(1, estoque.getId_produto());
                        stmt.setInt(2, estoque.getQuantidade());
                        stmt.setString(3, estoque.getDescricao());
                        stmt.setDouble(4, estoque.getPreco());
                        stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
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
}







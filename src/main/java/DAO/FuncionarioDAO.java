package DAO;

import JDBC.ConnectionFactory;
import MODEL.Estoque;
import MODEL.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioDAO {
    private Connection connection;
    
	public FuncionarioDAO() {
		this.connection = new ConnectionFactory().getConnection();

	}
public void adiciona(Funcionario funcionario ){
		String sql = "insert into funcionario" + "(funcao,nome)" + "values (?,?)";
		try {
                    PreparedStatement stmt = connection.prepareStatement(sql);
                        
                        stmt.setString(1, funcionario.getFuncao());
                        stmt.setString(2, funcionario.getNome());
                     
                        
                        stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}}
public void altera(Funcionario funcionario) {
		String sql = "update funcionario set funcao=?,nome=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			
			
			stmt.setString(1, funcionario.getFuncao());
			stmt.setString(2, funcionario.getNome());
			stmt.setInt(3, funcionario.getId_funcionario());

			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "Alterado com sucesso!");

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
public void remove(Funcionario funcionario) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from funcionario where id=?");

			stmt.setInt(1, funcionario.getId_funcionario());
			stmt.execute();
			stmt.close();

			JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
public List<Funcionario> getLista() {
		try {

			PreparedStatement stmt = this.connection.prepareStatement("select * from funcionario");
			ResultSet rs = stmt.executeQuery();
			List<Funcionario> funcionarios = new ArrayList<Funcionario>();
			while (rs.next()) {
				Funcionario funcionario = new Funcionario();
				funcionario.setId_funcionario(rs.getInt("id"));
				funcionario.setFuncao(rs.getString("Fução"));
                                funcionario.setNome(rs.getString("Nome"));
                                

				funcionarios.add(funcionario);
			}
			rs.close();
			stmt.close();
			return funcionarios;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}







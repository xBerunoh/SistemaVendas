package DAO;

import JDBC.ConnectionFactory;
import MODEL.Estoque;
import MODEL.Funcionario;
import MODEL.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VendaDAO {
    private Connection connection;
    
	public VendaDAO() {
		this.connection = new ConnectionFactory().getConnection();

	}
public void adiciona(Venda venda){
		String sql = "insert into venda" + "(quantidade_item,valor_total)" + "values (?,?)";
		try {
                    PreparedStatement stmt = connection.prepareStatement(sql);
                        
                        stmt.setInt(1,venda.getQuantidade_item());
                        stmt.setDouble(2,venda.getValor_total());
                        
                       
                     
                        
                        stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}}
public void altera(Venda venda) {
		String sql = "update venda set quantidade_item=?,valor_total=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			
			
			stmt.setString(1, venda.getQuantidade_item());
			stmt.setString(2, funcionario.getNome());
			stmt.setInt(3, venda.getId_venda());

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







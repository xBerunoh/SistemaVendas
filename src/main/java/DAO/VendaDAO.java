package DAO;

import JDBC.ConnectionFactory;
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
		String sql = "insert into venda" + "(fk_estoque, fk_funcionario,"
                        + " quantidade_item, valor_total)" + "values (?,?,?,?)";
		try {
                    PreparedStatement stmt = connection.prepareStatement(sql);
                        
                        stmt.setInt(1,venda.getFk_estoque());
                        stmt.setInt(2,venda.getFk_funcionario());
                        stmt.setInt(3, venda.getQuantidade_item());
                        stmt.setDouble(4, venda.getValor_total());
                        
                       
                     
                        
                        stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}}
public void altera(Venda venda) {
		String sql = "update venda set quantidade_item=?,valor_total=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			
			
			stmt.setInt(1, venda.getQuantidade_item());
			stmt.setDouble(2,venda.getValor_total());
			stmt.setInt(3, venda.getId_venda());

			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "Alterado com sucesso!");

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
public void remove(Venda venda) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from venda where id=?");

			stmt.setInt(1, venda.getId_venda());
			stmt.execute();
			stmt.close();

			JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
public List<Venda> getLista() {
		try {

			PreparedStatement stmt = this.connection.prepareStatement("select * from venda");
			ResultSet rs = stmt.executeQuery();
			List<Venda> vendas= new ArrayList<Venda>();
			while (rs.next()) {
				Venda venda= new Venda();
				venda.setId_venda(rs.getInt("id"));
                                venda.setQuantidade_item(rs.getInt("Quantidade"));
                                venda.setFk_funcionario(rs.getInt("Funcionario(ID)"));
                                venda.setFk_estoque(rs.getInt("Estoque(ID)"));
  
				venda.setValor_total(rs.getDouble("Valor Total"));
                                

				vendas.add(venda);
			}
			rs.close();
			stmt.close();
			return vendas;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}







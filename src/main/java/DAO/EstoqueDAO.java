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
		String sql = "insert into estoque" + "(descricao,preco,quantidade)" + "values (?, ?, ?)";
		try {
                    PreparedStatement stmt = connection.prepareStatement(sql);

			
                        stmt.setString(1, estoque.getDescricao());
                        stmt.setDouble(2, estoque.getPreco());
                        stmt.setInt(3, estoque.getQuantidade());
                        stmt.execute();
			stmt.close();
                        JOptionPane.showMessageDialog(null, "inserido com sucesso!");

		} catch (Exception e) {
			
                        JOptionPane.showMessageDialog(null, "ERRO: "+e);
		}
}
public void altera(Estoque estoque) {
		String sql = "update estoque set quantidade=?, descricao=?, preco=?  where id_produto=?;";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setInt(1, estoque.getQuantidade());
			stmt.setString(2, estoque.getDescricao());
			stmt.setDouble(3, estoque.getPreco());
			stmt.setInt(4, estoque.getId_produto());

			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "Alterado com sucesso!");

		} catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                }
	}
public void remove(Estoque estoque) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from estoque where id_produto=?");

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
				estoque.setId_produto(rs.getInt("id_produto"));
				estoque.setDescricao(rs.getString("descricao"));
                                estoque.setPreco(rs.getDouble("preco"));
                                estoque.setQuantidade(rs.getInt("quantidade"));

				estoques.add(estoque);
			}
			rs.close();
			stmt.close();
			return estoques;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
                           return null;
		}
     
           
	}
 public List<Estoque> buscaProdutoPorNome(String nome){
    
       try {
            
            List<Estoque> lista = new ArrayList<>();
            String sql= "select * from estoque where descricao like ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, nome);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
            
            Estoque obj = new Estoque();
            
            obj.setId_produto(rs.getInt("id_produto"));
            obj.setQuantidade(rs.getInt("quantidade"));
            obj.setDescricao(rs.getString("descricao"));
            obj.setPreco(rs.getDouble("preco"));
            
            
            
            lista.add(obj);
            
            
            
            }
            
           return lista;
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    }
  public Estoque consultaPorNome(String nome){
        try {
 
            String sql= "select * from estoque where descricao like ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, nome);
            ResultSet rs = pst.executeQuery();   
            Estoque obj = new Estoque();

             if(rs.next()){
            
            
             obj.setId_produto(rs.getInt("id_produto"));
            obj.setQuantidade(rs.getInt("quantidade"));
            obj.setDescricao(rs.getString("descricao"));
            obj.setPreco(rs.getDouble("preco"));
            
            
            
            
            }
             return obj;
        
        
        
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Erro, cliente não encontrado,"
                    + "para mais detalhes segue o codigo detalhado: \n"+ e);
            return null;
            
            
        }
    }
    

}







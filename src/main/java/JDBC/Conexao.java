/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author bruno
 */
public class Conexao {
	public static void main(String[] args) throws SQLException {
            try (Connection conexao = new ConnectionFactory().getConnection()) {
                System.out.println("Conexão aberta");
            }

	}

}
   
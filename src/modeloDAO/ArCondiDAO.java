/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import banco.ArCondicionado;
import connection.ConnectionFactory;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Prosperar1 - RIO
 */
public class ArCondiDAO {
         
        public void create(ArCondicionado ar) {
            
            
	Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
            
            try{
              // cria um preparedStatement
		String sql = "insert into arcondicionado"
				+ " (marca,modelo,tipo,efiEnergitica,voltagem,capacidade,dimensoes,peso,quantidade,valor)"
				+ " values (?,?,?,?,?,?,?,?,?,?)";
		stmt = con.prepareStatement(sql);

		// preenche os valores
		stmt.setString(1, ar.getMarca());
		stmt.setString(2, ar.getModelo());
		stmt.setString(3, ar.getTipo());
		stmt.setString(4, ar.getEfiEnergetica());
		stmt.setString(5, ar.getVoltagem());
		stmt.setString(6, ar.getCapacidade());
		stmt.setString(7, ar.getDimensoes());
		stmt.setDouble(8,ar.getPeso());
                stmt.setInt(9, ar.getQuantidade());
                stmt.setDouble(10, ar.getValor());
                
                stmt.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
                
            }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "ERRO AO SALVAR"+ex);
                
            }finally{
                ConnectionFactory.CloseConnection(con, stmt);
            }
                
		
        }
}
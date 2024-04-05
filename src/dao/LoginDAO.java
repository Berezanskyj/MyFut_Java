/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.UsuarioVO;
import modelo.LoginVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author berez
 */
public class LoginDAO {
    
    Connection con;
    
    public ResultSet autenticarLogin(LoginVO lVO) throws SQLException {
        
        con = new ConexaoBanco().getConexao();
        
        try{
            String sql;
            
            sql = "select * from login where login=? and senha=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, lVO.getLogin());
            pstm.setString(2, lVO.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException se){
            JOptionPane.showMessageDialog(
                    null,
                    "LoginDAO " + se);
            return null;
        }
    }
    
    public void cadastrarLogin(LoginVO lVO) throws SQLException {
        Connection con = new ConexaoBanco().getConexao();
        
        try{
            String sql = "INSERT INTO login VALUES (null, ?,?)";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, lVO.getLogin());
            pstm.setString(2, lVO.getSenha());
              
            pstm.execute();
            pstm.close();
            
            
        } catch (SQLException se){
            throw new SQLException("Erro no cadastro do registro!" + se.getMessage());
            
        } finally {
            con.close();
        }
    }
    
}





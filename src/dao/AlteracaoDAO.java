/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import modelo.ProprietarioVO;
import modelo.UsuarioVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author berez
 */
public class AlteracaoDAO {
    
    public void cadastrarUsuario(UsuarioVO cVO) throws SQLException {
        Connection con = new ConexaoBanco().getConexao();
        
        try{
            String sql = "INSERT INTO registro_usuario VALUES (null, ?,?,?,?,?)";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, cVO.getNome());
            pstm.setString(2, cVO.getTelefone());
            pstm.setString(3, cVO.getEmail());
            pstm.setString(4, cVO.getCpf());
            pstm.setString(5, cVO.getSenha());
            
            
            pstm.execute();
            pstm.close();
            
            
        } catch (SQLException se){
            throw new SQLException("Erro no cadastro do registro!" + se.getMessage());
            
        } finally {
            con.close();
        }
    }
    
    public ArrayList<UsuarioVO> buscarUsuario() throws SQLException {
        Connection con = new ConexaoBanco().getConexao();
        
        try{
            String sql = "Select * from registro_usuario";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            ArrayList<UsuarioVO> procura = new ArrayList<>();
            
            while (rs.next()){
                UsuarioVO cVO = new UsuarioVO();
                
                cVO.setIdusuario(rs.getLong("idusuario"));
                cVO.setNome(rs.getString("nome"));
                cVO.setTelefone(rs.getString("telefone"));
                cVO.setEmail(rs.getString("email"));
                cVO.setCpf(rs.getString("cpf"));
                cVO.setSenha(rs.getString("senha"));
                                
                procura.add(cVO);
            }// fim while
            pstm.close();
            
            return procura;
            
        } catch (SQLException se){
            throw new SQLException("Erro ao buscar registro! " + se.getMessage());
        } finally {
            con.close();
        }
    } // end of buscarColaborador
    
    public ArrayList<UsuarioVO> filtrarUsuario(String query) throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
        
        try {
            String sql = "Select * from registro_usuario " + query;
            PreparedStatement pstm = con.prepareCall(sql);
            ResultSet rs = pstm.executeQuery();
            
            ArrayList<UsuarioVO> colab = new ArrayList<>();
            
            while (rs.next()){
                UsuarioVO cVO = new UsuarioVO();
                
                cVO.setIdusuario(rs.getLong("idusuario"));
                cVO.setNome(rs.getString("nome"));
                cVO.setTelefone(rs.getString("telefone"));
                cVO.setEmail(rs.getString("email"));
                cVO.setCpf(rs.getString("cpf"));
                cVO.setSenha(rs.getString("senha"));
                
                colab.add(cVO);
            }
            
            pstm.close();
            
            return colab;
        } catch (SQLException se){
            throw new SQLException("Erro ao filtrar registro! " + se.getMessage());
        } finally{
            con.close();
        }
    }
    
    public void deletarUsuario(long idusuario) throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
        
        try{
            String sql = "delete from registro_usuario where idusuario = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            
            pstm.setLong(1, idusuario);
            pstm.execute();
            pstm.close();
        } catch (SQLException se){
            throw new SQLException("Erro ao deletar registro! AlteracaoDAO " + se.getMessage());
        } finally{
            con.close();
        }
    }
    
    public void alterarUsuario(UsuarioVO cVO) throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
        
        try {
            String sql;
            sql = "Update registro_usuario set "
                    + "nome = ' " + cVO.getNome() + " ', "
                    + "telefone = ' " + cVO.getTelefone() + " ', "
                    + "email = ' " + cVO.getEmail() + " ', "
                    + "cpf = ' " + cVO.getCpf() + " ', "
                    + "senha = ' " + cVO.getSenha() + " '"
                    + " where idusuario = " + cVO.getIdusuario() + " ";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();
            pstm.close();
        } catch(SQLException se){
            throw new SQLException("Erro ao alterar registro!" + se.getMessage());
        } finally {
            con.close();
        }
    }
    
    /////PROPRIETARIO
    
    
    public void cadastrarProprietario(ProprietarioVO pVO) throws SQLException {
        Connection con = new ConexaoBanco().getConexao();
        
        try{
            String sql = "INSERT INTO registro_proprietario VALUES (null, ?,?,?,?,?)";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, pVO.getNome());
            pstm.setString(2, pVO.getTelefone());
            pstm.setString(3, pVO.getEmail());
            pstm.setString(4, pVO.getCnpj());
            pstm.setString(5, pVO.getSenha());
            
            
            pstm.execute();
            pstm.close();
            
            
        } catch (SQLException se){
            throw new SQLException("Erro no cadastro do registro!" + se.getMessage());
            
        } finally {
            con.close();
        }
    }
    
    public ArrayList<ProprietarioVO> buscarProprietario() throws SQLException {
        Connection con = new ConexaoBanco().getConexao();
        
        try{
            String sql = "Select * from registro_proprietario";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            ArrayList<ProprietarioVO> procura = new ArrayList<>();
            
            while (rs.next()){
                ProprietarioVO pVO = new ProprietarioVO();
                
                pVO.setIdproprietario(rs.getLong("idproprietario"));
                pVO.setNome(rs.getString("nome"));
                pVO.setTelefone(rs.getString("telefone"));
                pVO.setEmail(rs.getString("email"));
                pVO.setCnpj(rs.getString("cnpj"));
                pVO.setSenha(rs.getString("senha"));
                                
                procura.add(pVO);
            }// fim while
            pstm.close();
            
            return procura;
            
        } catch (SQLException se){
            throw new SQLException("Erro ao buscar registro! " + se.getMessage());
        } finally {
            con.close();
        }
    } // end of buscarColaborador
    
    public ArrayList<ProprietarioVO> filtrarProprietario(String query) throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
        
        try {
            String sql = "Select * from registro_proprietario " + query;
            PreparedStatement pstm = con.prepareCall(sql);
            ResultSet rs = pstm.executeQuery();
            
            ArrayList<ProprietarioVO> colab = new ArrayList<>();
            
            while (rs.next()){
                ProprietarioVO pVO = new ProprietarioVO();
                
                pVO.setIdproprietario(rs.getLong("idproprietario"));
                pVO.setNome(rs.getString("nome"));
                pVO.setTelefone(rs.getString("telefone"));
                pVO.setEmail(rs.getString("email"));
                pVO.setCnpj(rs.getString("cnpj"));
                pVO.setSenha(rs.getString("senha"));
                
                colab.add(pVO);
            }
            
            pstm.close();
            
            return colab;
        } catch (SQLException se){
            throw new SQLException("Erro ao filtrar registro! " + se.getMessage());
        } finally{
            con.close();
        }
    }
    
    public void deletarProprietario(long idproprietario) throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
        
        try{
            String sql = "delete from registro_proprietario where idproprietario = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            
            pstm.setLong(1, idproprietario);
            pstm.execute();
            pstm.close();
        } catch (SQLException se){
            throw new SQLException("Erro ao deletar registro! AlteracaoDAO " + se.getMessage());
        } finally{
            con.close();
        }
    }
    
    public void alterarProprietario(ProprietarioVO pVO) throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
        
        try {
            String sql;
            sql = "Update registro_proprietario set "
                    + "nome = ' " + pVO.getNome() + " ', "
                    + "telefone = ' " + pVO.getTelefone() + " ', "
                    + "email = ' " + pVO.getEmail() + " ', "
                    + "cnpj = ' " + pVO.getCnpj() + " ', "
                    + "senha = ' " + pVO.getSenha() + " '"
                    + " where idusuario = " + pVO.getIdproprietario() + " ";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();
            pstm.close();
        } catch(SQLException se){
            throw new SQLException("Erro ao alterar registro!" + se.getMessage());
        } finally {
            con.close();
        }
    }
}

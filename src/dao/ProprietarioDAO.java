/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ProprietarioVO;
import modelo.QuadraVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author 832000223
 */
public class ProprietarioDAO {
    public void cadastrarProprietario(ProprietarioVO pVO) throws SQLException {
        Connection con = new ConexaoBanco().getConexao();
        
        try{
            String sql = "INSERT INTO registro_proprietario VALUES (null, ?,?,?,?,?,?)";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, pVO.getNome());
            pstm.setString(2, pVO.getTelefone());
            pstm.setString(3, pVO.getEmail());
            pstm.setString(4, pVO.getCnpj());
            pstm.setString(5, pVO.getSenha());
            pstm.setString(6, pVO.getUsuario());
            
            
            
            
            pstm.execute();
            pstm.close();
            
            
        } catch (SQLException se){
            throw new SQLException("Erro no cadastro do registro!" + se.getMessage());
            
        } finally {
            con.close();
        }
    }
    
    public void cadastrarLoginProprietario(ProprietarioVO pVO) throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
        
        try{
            String sql = "INSERT INTO login VALUES (null, ?,?)";
            
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setString(1, pVO.getSenha());
            pstm.setString(2, pVO.getUsuario());
                                   
            
            pstm.execute();
            pstm.close();
            
            
        } catch (SQLException se){
            throw new SQLException("Erro ao inserir Login!" + se.getMessage());
            
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

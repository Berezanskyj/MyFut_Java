/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import persistencia.ConexaoBanco;
import modelo.PartidaVO;
import view.GUIRegistroPartida;

/**
 *
 * @author berez
 */
public class PartidaDAO {
    
    public void  cadastrarPartida(PartidaVO pVO) throws SQLException {
        
        Connection con = new ConexaoBanco().getConexao();
        
        try{
        
        String sql = "INSERT INTO registro_partida VALUES (null, ?, ?, ?, ?, ?, ?, ?);";
        
        PreparedStatement pstm = con.prepareStatement(sql);
        
        pstm.setString(1, pVO.getNome_responsavel());
        pstm.setString(2, pVO.getTelefone_responsavel());
        pstm.setInt(3, pVO.getIdquadra());
        pstm.setInt(4, pVO.getNum_quadra());
        pstm.setInt(5, pVO.getMax_jogadores());
        pstm.setString(6, pVO.getEndereco_quadra());
        pstm.setString(7, pVO.getData_partida());
        
        pstm.execute();
        pstm.close();
        
        
    } catch (SQLException se){
        throw new SQLException("Erro no cadastro de partida! " + se.getMessage());
    } finally {
        con.close();
                
        
    } 
}
    
    public ResultSet listarQuadras() throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
        
        String sql = "SELECT idquadra, nome_estabelecimento, numero_quadra, max_jogadores_quadra, endereco_quadra FROM registro_quadra ORDER BY nome_estabelecimento;";
        
        try{
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException se){
            throw new SQLException("Erro ao listar quadras! " + se.getMessage());
        }
    }
    
    public ResultSet listarInfos(Integer Indice) throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
        
        
        String sql = "SELECT numero_quadra, max_jogadores_quadra,endereco_quadra FROM registro_quadra WHERE idquadra = ?;";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setInt(1, Indice);
        
        try{
            return pstm.executeQuery();
        } catch (SQLException se){
            throw new SQLException("Erro ao listar quadras! " + se.getMessage());
        }
    }
    
   
}


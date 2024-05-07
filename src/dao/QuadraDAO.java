/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.QuadraVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author 832000223
 */
public class QuadraDAO {
    public void cadastrarQuadra(QuadraVO qVO) throws SQLException {
        Connection con = new ConexaoBanco().getConexao();
        
        try{
            String sql = "INSERT INTO registro_quadra VALUES (null, ?,?,?,?,?,?, ?)";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, qVO.getNome_responsavel());
            pstm.setString(2, qVO.getTelefone_proprietario());
            pstm.setString(3, qVO.getEndereco());
            pstm.setString(4, qVO.getCnpj_responsavel());
            pstm.setInt(5, qVO.getMax_jogadores());
            pstm.setInt(6, qVO.getNumero_quadra());
            pstm.setString(7, qVO.getNomeEstabelecimento());
            
            
            pstm.execute();
            pstm.close();
            
            
        } catch (SQLException se){
            throw new SQLException("Erro no cadastro do registro!" + se.getMessage());
            
        } finally {
            con.close();
        }
    }
}

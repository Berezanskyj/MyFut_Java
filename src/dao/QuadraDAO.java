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
import javax.swing.JOptionPane;
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
    
    
    public ArrayList<QuadraVO> buscarQuadra() throws SQLException {
        Connection con = new ConexaoBanco().getConexao();
        
        try{
            String sql = "Select * from registro_quadra";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            ArrayList<QuadraVO> procura = new ArrayList<>();
            
            while (rs.next()){
                QuadraVO qVO = new QuadraVO();
                
                qVO.setIdquadra(rs.getInt("idquadra"));
                qVO.setNome_responsavel(rs.getString("nome_proprietario"));
                qVO.setTelefone_proprietario(rs.getString("telefone_proprietario"));
                qVO.setEndereco(rs.getString("endereco_quadra"));
                qVO.setCnpj_responsavel(rs.getString("cnpj_proprietario"));
                qVO.setMax_jogadores(rs.getInt("max_jogadores_quadra"));
                qVO.setNumero_quadra(rs.getInt("numero_quadra"));
                qVO.setNomeEstabelecimento(rs.getString("nome_estabelecimento"));
                                
                procura.add(qVO);
            }// fim while
            pstm.close();
            
            return procura;
            
        } catch (SQLException se){
            throw new SQLException("Erro ao buscar quadra! " + se.getMessage());
        } finally {
            con.close();
        }
    } // end of buscarColaborador
    
    public ArrayList<QuadraVO> filtrarQuadra(String query) throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
        
        try {
            String sql = "Select * from registro_quadra " + query;
            PreparedStatement pstm = con.prepareCall(sql);
            ResultSet rs = pstm.executeQuery();
            
            ArrayList<QuadraVO> quadra = new ArrayList<>();
            
            while (rs.next()){
                QuadraVO qVO = new QuadraVO();
                
                qVO.setIdquadra(rs.getInt("idquadra"));
                qVO.setNome_responsavel(rs.getString("nome_proprietario"));
                qVO.setTelefone_proprietario(rs.getString("telefone_proprietario"));
                qVO.setEndereco(rs.getString("endereco_quadra"));
                qVO.setCnpj_responsavel(rs.getString("cnpj_proprietario"));
                qVO.setMax_jogadores(rs.getInt("max_jogadores_quadra"));
                qVO.setNumero_quadra(rs.getInt("numero_quadra"));
                qVO.setNomeEstabelecimento(rs.getString("nome_estabelecimento"));
                
                quadra.add(qVO);
            }
            
            pstm.close();
            
            return quadra;
        } catch (SQLException se){
            throw new SQLException("Erro ao filtrar quadra! " + se.getMessage());
        } finally{
            con.close();
        }
    }
    
    public void deletarQuadra(int idquadra) throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
        
        try {
            // Verificar se há partidas associadas à quadra
            String sql = "SELECT COUNT(*) FROM registro_partida WHERE idquadra = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, idquadra);
            ResultSet rs = pstm.executeQuery();
            rs.next();
            int numPartidas = rs.getInt(1);

            if (numPartidas > 0) {
                // Há partidas associadas à quadra, notificar o usuário ou realizar outra ação apropriada
                JOptionPane.showMessageDialog(null, "Não é possível excluir a quadra pois existem partidas associadas a ela.", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                // Não há partidas associadas, proceder com a exclusão da quadra
                sql = "DELETE FROM registro_quadra WHERE idquadra = ?";
                pstm = con.prepareStatement(sql);
                pstm.setInt(1, idquadra);
                pstm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Quadra excluida com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }

            // Fechar recursos
            rs.close();
            pstm.close();
        } catch (SQLException se) {
            throw new SQLException("Erro ao deletar registro! AlteracaoDAO " + se.getMessage());
        } finally {
            con.close();
        }
    }
    
    
    public void alterarQuadra(QuadraVO qVO) throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
        
        try {
            String sql;
            sql = "Update registro_quadra set "
                    + "nome_proprietario = ' " + qVO.getNome_responsavel()+ " ', "
                    + "telefone_proprietario = ' " + qVO.getTelefone_proprietario()+ " ', "
                    + "endereco_quadra = ' " + qVO.getEndereco()+ " ', "
                    + "cnpj_proprietario = ' " + qVO.getCnpj_responsavel()+ " ', "
                    + "max_jogadores_quadra = ' " + qVO.getMax_jogadores() + "',"
                    + "numero_quadra = ' " + qVO.getNumero_quadra() + " ', "
                    + "nome_estabelecimento = ' " + qVO.getNomeEstabelecimento()+ "' "
                    + " where idquadra = " + qVO.getIdquadra() + " ";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();
            pstm.close();
        } catch(SQLException se){
            throw new SQLException("Erro ao alterar quadra!" + se.getMessage());
        } finally {
            con.close();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.QuadraDAO;
import dao.QuadraDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.QuadraVO;
import modelo.QuadraVO;

/**
 *
 * @author 832000223
 */
public class QuadraServicos {
    public void cadastrarQuadra(QuadraVO qVO) throws SQLException {
        QuadraDAO qDAO = DAOFactory.getQuadraDAO();
        qDAO.cadastrarQuadra(qVO);
    }//fim do métoso cadastrarProduto
    
    public ArrayList<QuadraVO> buscarQuadra() throws SQLException{
        QuadraDAO qDAO = DAOFactory.getQuadraDAO();
        return qDAO.buscarQuadra();
    }//fim do método buscarProduto
    
    public ArrayList<QuadraVO> filtrarQuadra(String query) throws SQLException{
        QuadraDAO qDAO = DAOFactory.getQuadraDAO();
        return qDAO.filtrarQuadra(query);
    }//fim do método filtrarProduto
    
    public void deletarQuadra( int idquadra) throws SQLException{
        QuadraDAO qDAO = DAOFactory.getQuadraDAO();
        qDAO.deletarQuadra(idquadra);
    }//fim do método deletarProduto
    
    public void alterarQuadra(QuadraVO qVO) throws SQLException{
        QuadraDAO qDAO = DAOFactory.getQuadraDAO();
        qDAO.alterarQuadra(qVO);
    }//fim do método alterarProduto
}

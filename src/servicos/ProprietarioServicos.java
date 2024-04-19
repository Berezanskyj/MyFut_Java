/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.ProprietarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ProprietarioVO;

/**
 *
 * @author 832000223
 */
public class ProprietarioServicos {
    public void cadastrarProprietario(ProprietarioVO pVO) throws SQLException {
        ProprietarioDAO cDAO = DAOFactory.getProprietarioDAO();
        cDAO.cadastrarProprietario(pVO);
    }//fim do métoso cadastrarProduto
    
    public ArrayList<ProprietarioVO> buscarProprietario() throws SQLException{
        ProprietarioDAO cDAO = DAOFactory.getProprietarioDAO();
        return cDAO.buscarProprietario();
    }//fim do método buscarProduto
    
    public ArrayList<ProprietarioVO> filtrarProprietario(String query) throws SQLException{
        ProprietarioDAO cDAO = DAOFactory.getProprietarioDAO();
        return cDAO.filtrarProprietario(query);
    }//fim do método filtrarProduto
    
    public void deletarProprietario( long idproprietario) throws SQLException{
        ProprietarioDAO cDAO = DAOFactory.getProprietarioDAO();
        cDAO.deletarProprietario(idproprietario);
    }//fim do método deletarProduto
    
    public void alterarProprietario(ProprietarioVO pVO) throws SQLException{
        ProprietarioDAO cDAO = DAOFactory.getProprietarioDAO();
        cDAO.alterarProprietario(pVO);
    }//fim do método alterarProduto
}

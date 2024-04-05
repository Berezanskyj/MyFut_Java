/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import dao.AlteracaoDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ProprietarioVO;
import modelo.UsuarioVO;

/**
 *
 * @author berez
 */
public class AlteracaoServicos {
    
    public void cadastrarUsuario(UsuarioVO cVO) throws SQLException {
        AlteracaoDAO cDAO = DAOFactory.getAlteracaoDAO();
        cDAO.cadastrarUsuario(cVO);
    }//fim do métoso cadastrarProduto
    
    public ArrayList<UsuarioVO> buscarUsuario() throws SQLException{
        AlteracaoDAO cDAO = DAOFactory.getAlteracaoDAO();
        return cDAO.buscarUsuario();
    }//fim do método buscarProduto
    
    public ArrayList<UsuarioVO> filtrarUsuario(String query) throws SQLException{
        AlteracaoDAO cDAO = DAOFactory.getAlteracaoDAO();
        return cDAO.filtrarUsuario(query);
    }//fim do método filtrarProduto
    
    public void deletarUsuario( long idproduto) throws SQLException{
        AlteracaoDAO cDAO = DAOFactory.getAlteracaoDAO();
        cDAO.deletarUsuario(idproduto);
    }//fim do método deletarProduto
    
    public void alterarUsuario(UsuarioVO cVO) throws SQLException{
        AlteracaoDAO cDAO = DAOFactory.getAlteracaoDAO();
        cDAO.alterarUsuario(cVO);
    }//fim do método alterarProduto
    
    public void cadastrarProprietario(ProprietarioVO pVO) throws SQLException {
        AlteracaoDAO cDAO = DAOFactory.getAlteracaoDAO();
        cDAO.cadastrarProprietario(pVO);
    }//fim do métoso cadastrarProduto
    
    public ArrayList<ProprietarioVO> buscarProprietario() throws SQLException{
        AlteracaoDAO cDAO = DAOFactory.getAlteracaoDAO();
        return cDAO.buscarProprietario();
    }//fim do método buscarProduto
    
    public ArrayList<ProprietarioVO> filtrarProprietario(String query) throws SQLException{
        AlteracaoDAO cDAO = DAOFactory.getAlteracaoDAO();
        return cDAO.filtrarProprietario(query);
    }//fim do método filtrarProduto
    
    public void deletarProprietario( long idproprietario) throws SQLException{
        AlteracaoDAO cDAO = DAOFactory.getAlteracaoDAO();
        cDAO.deletarProprietario(idproprietario);
    }//fim do método deletarProduto
    
    public void alterarProprietario(ProprietarioVO pVO) throws SQLException{
        AlteracaoDAO cDAO = DAOFactory.getAlteracaoDAO();
        cDAO.alterarProprietario(pVO);
    }//fim do método alterarProduto
    
    
    
    
    
    
    
}//fecha a classe ProdutoServicos
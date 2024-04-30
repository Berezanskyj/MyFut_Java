/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import dao.UsuarioDAO;
import dao.DAOFactory;
import dao.ProprietarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ProprietarioVO;
import modelo.UsuarioVO;

/**
 *
 * @author berez
 */
public class UsuarioServicos {
    
    public void cadastrarUsuario(UsuarioVO cVO) throws SQLException {
        UsuarioDAO cDAO = DAOFactory.getAlteracaoDAO();
        cDAO.cadastrarUsuario(cVO);
    }//fim do métoso cadastrarProduto
    
    public void cadastrarUsuarioLogin(UsuarioVO cVO) throws SQLException {
        UsuarioDAO cDAO = DAOFactory.getAlteracaoDAO();
        cDAO.cadastrarUsuarioLogin(cVO);
    }//fim do métoso cadastrarProduto

    
    public ArrayList<UsuarioVO> buscarUsuario() throws SQLException{
        UsuarioDAO cDAO = DAOFactory.getAlteracaoDAO();
        return cDAO.buscarUsuario();
    }//fim do método buscarProduto
    
    public ArrayList<UsuarioVO> filtrarUsuario(String query) throws SQLException{
        UsuarioDAO cDAO = DAOFactory.getAlteracaoDAO();
        return cDAO.filtrarUsuario(query);
    }//fim do método filtrarProduto
    
    public void deletarUsuario( long idproduto) throws SQLException{
        UsuarioDAO cDAO = DAOFactory.getAlteracaoDAO();
        cDAO.deletarUsuario(idproduto);
    }//fim do método deletarProduto
    
    public void alterarUsuario(UsuarioVO cVO) throws SQLException{
        UsuarioDAO cDAO = DAOFactory.getAlteracaoDAO();
        cDAO.alterarUsuario(cVO);
    }//fim do método alterarProduto
    
    
    
    
    
    
    
    
    
}//fecha a classe ProdutoServicos
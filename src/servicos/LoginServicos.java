/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.LoginDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import modelo.LoginVO;

/**
 *
 * @author 832000223
 */
public class LoginServicos {
    public void cadastrarLogin(LoginVO lVO) throws SQLException {
        LoginDAO lDAO = DAOFactory.getLoginDAO();
        lDAO.cadastrarLogin(lVO);
    }//fim do métoso cadastrarProduto
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.ProprietarioDAO;
import dao.QuadraDAO;
import java.sql.SQLException;
import modelo.ProprietarioVO;
import modelo.QuadraVO;

/**
 *
 * @author 832000223
 */
public class QuadraServicos {
    public void cadastrarQuadra(QuadraVO qVO) throws SQLException {
        QuadraDAO cDAO = DAOFactory.getQuadraDAO();
        cDAO.cadastrarQuadra(qVO);
    }//fim do métoso cadastrarProduto
}

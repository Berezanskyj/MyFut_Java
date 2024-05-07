/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import dao.DAOFactory;
import dao.PartidaDAO;
import java.sql.SQLException;
import modelo.PartidaVO;

/**
 *
 * @author berez
 */
public class PartidaServicos {
    public void cadastrarPartida(PartidaVO pVO) throws SQLException {
        PartidaDAO pDAO = DAOFactory.getPartidaDAO();
        pDAO.cadastrarPartida(pVO);
    }
}

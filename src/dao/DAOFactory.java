/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author berez
 */
public class DAOFactory {
    
    //Instanciando o objeto a classe ProdutoDAO
    private static UsuarioDAO alteracaoDAO = new UsuarioDAO();
    private static LoginDAO loginDAO = new LoginDAO();
    private static ProprietarioDAO proprietarioDAO = new ProprietarioDAO();
    private static QuadraDAO quadraDAO = new QuadraDAO();
    
    //Fazendo uma cópia dos métodos da classe ProdutoDAO e 
    //disponibilizar para a classe que solicitar
    public static UsuarioDAO getAlteracaoDAO(){
        return alteracaoDAO;
    }//fim do método getAlteracaoDAO
    
    public static LoginDAO getLoginDAO(){
        return loginDAO;
    }
    
    public static ProprietarioDAO getProprietarioDAO(){
        return proprietarioDAO;
    }
    
    public static QuadraDAO getQuadraDAO(){
        return quadraDAO;
    }
    
}//fecha a classe DAOFactory


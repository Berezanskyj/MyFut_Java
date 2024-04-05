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
    private static AlteracaoDAO alteracaoDAO = new AlteracaoDAO();
    private static LoginDAO loginDAO = new LoginDAO();
    
    //Fazendo uma cópia dos métodos da classe ProdutoDAO e 
    //disponibilizar para a classe que solicitar
    public static AlteracaoDAO getAlteracaoDAO(){
        return alteracaoDAO;
    }//fim do método getAlteracaoDAO
    
    public static LoginDAO getLoginDAO(){
        return loginDAO;
    }
    
}//fecha a classe DAOFactory


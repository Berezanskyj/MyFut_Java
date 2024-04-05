/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

/**
 *
 * @author berez
 */
public class ServicosFactory {
    private static AlteracaoServicos alteracaoServicos = new AlteracaoServicos();
    private static LoginServicos loginServicos = new LoginServicos();
       
        public static AlteracaoServicos getAlteracaoServicos(){
        return alteracaoServicos;
    }//fim do método getProdutoServicos
        
        public static LoginServicos getLoginServicos(){
            return loginServicos;
        }
    
   
}//fecha a classe ServicosFactory

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
    private static UsuarioServicos alteracaoServicos = new UsuarioServicos();
    private static LoginServicos loginServicos = new LoginServicos();
    private static ProprietarioServicos proprietarioServicos = new ProprietarioServicos();
    private static QuadraServicos quadraServicos = new QuadraServicos();
    private static PartidaServicos partidaServicos = new PartidaServicos();
       
        public static UsuarioServicos getAlteracaoServicos(){
        return alteracaoServicos;
    }//fim do método getProdutoServicos
        
        public static LoginServicos getLoginServicos(){
            return loginServicos;
        }
        
        public static ProprietarioServicos getProprietarioServicos(){
            return proprietarioServicos;
        }
        
        public static QuadraServicos getQuadraServicos(){
            return quadraServicos;
        }
        
        public static PartidaServicos getPartidaServicos(){
            return partidaServicos;
        }
    
   
}//fecha a classe ServicosFactory

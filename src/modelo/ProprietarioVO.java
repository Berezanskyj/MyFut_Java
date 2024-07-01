/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 832000223
 */
public class ProprietarioVO {
    
    private long idproprietario;
    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;
    private String cnpj;
    private String senha;
    private String usuario;
    private long idperfil;

    public long getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(long idperfil) {
        this.idperfil = idperfil;
    }
            
    
            

    public long getIdproprietario() {
        return idproprietario;
    }

    public void setIdproprietario(long idproprietario) {
        this.idproprietario = idproprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    

    
    
    
}

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
public class QuadraVO {
    private int idquadra;
    private String nome_responsavel;
    private String telefone_proprietario;
    private String endereco;
    private String cnpj_responsavel;
    private int max_jogadores;
    private int numero_quadra;

    public int getIdquadra() {
        return idquadra;
    }

    public void setIdquadra(int idquadra) {
        this.idquadra = idquadra;
    }

    public String getNome_responsavel() {
        return nome_responsavel;
    }

    public void setNome_responsavel(String nome_responsavel) {
        this.nome_responsavel = nome_responsavel;
    }

    public String getTelefone_proprietario() {
        return telefone_proprietario;
    }

    public void setTelefone_proprietario(String telefone_proprietario) {
        this.telefone_proprietario = telefone_proprietario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj_responsavel() {
        return cnpj_responsavel;
    }

    public void setCnpj_responsavel(String cnpj_responsavel) {
        this.cnpj_responsavel = cnpj_responsavel;
    }

    public int getMax_jogadores() {
        return max_jogadores;
    }

    public void setMax_jogadores(int max_jogadores) {
        this.max_jogadores = max_jogadores;
    }

    public int getNumero_quadra() {
        return numero_quadra;
    }

    public void setNumero_quadra(int numero_quadra) {
        this.numero_quadra = numero_quadra;
    }
    
    
}

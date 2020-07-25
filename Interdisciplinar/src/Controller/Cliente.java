/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Murilo
 */
public class Cliente 
{
    private int codigo;
    private String nome;
    private String cpf;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String telefone;
    private String tipo_pessoa;
    private String cnpj;
    private String rg;
    private String celular;
    private String email;
    private String cep;
    private String data_nascimento;
    
    //-------------------------(SET e GET codigo)-------------------------------
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    public int getCodigo()
    {
        return this.codigo;
    }
        
    //-------------------------(SET e GET nome)---------------------------------
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }
    
    //-------------------------(SET e GET cpf)----------------------------------
    public void setCpf(String cpf)
    {
        this.cpf =   cpf;
    }
    public String getCpf()
    {
        return this.cpf;
    }

    //-------------------------(SET e GET endereco)-----------------------------
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }
    public String getEndereco()
    {
        return this.endereco;
    }
    
    //-------------------------(SET e GET numero)-------------------------------
    public void setNumero(String numero)
    {
        this.numero = numero;
    }
    public String getNumero()
    {
        return this.numero;
    }
    
    //-------------------------(SET e GET bairro)-------------------------------
    public void setBairro(String bairro)
    {
        this.bairro = bairro;
    }
    public String getBairro()
    {
        return this.bairro;
    }
    
    //-------------------------(SET e GET cidade)-------------------------------
    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }
    public String getCidade()
    {
        return this.cidade;
    }
    
    //-------------------------(SET e GET estado)-------------------------------
    public void setEstado(String estado)
    {
        this.uf = estado;
    }
    public String getEstado()
    {
        return this.uf;
    }
    
    //-------------------------(SET e GET telefone)-----------------------------
    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }
    public String getTelefone()
    {
        return this.telefone;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTipo_pessoa() {
        return tipo_pessoa;
    }

    public void setTipo_pessoa(String tipo_pessoa) {
        this.tipo_pessoa = tipo_pessoa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
    
}

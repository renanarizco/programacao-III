/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author UNIFAFIBE
 */
public abstract class Pessoa {
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public Pessoa(String Nome) {
        this.nome = Nome;
    }

    @Override
    public String toString() {
        return "nome: " + nome ;
    }
    
    
    
    
    
    public void printaAttributos(){
        System.out.println(this.toString());
        
    }
    
}

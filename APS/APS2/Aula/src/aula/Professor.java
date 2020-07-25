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
public class Professor extends Pessoa implements AvaliadorInterface {
    
    public Professor(String nome) {
        super(nome);
    }

    @Override
    public void fazerProva() {
        System.out.println("Prova realizada por: "+ this.nome);
    }
    
    
}

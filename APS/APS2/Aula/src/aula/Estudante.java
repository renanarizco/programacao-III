/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;
import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author UNIFAFIBE
 */
public class Estudante extends Pessoa implements AvaliadoInterface {
    private int idade;
    Random random = new Random();
    private float numero = random.nextFloat()*10;
    
    DecimalFormat f = new DecimalFormat("#.##");

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Estudante(String nome,int idade) {
        super(nome);
        this.idade = idade;
    }

    @Override
    public void printaAttributos() {
        super.printaAttributos(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Idade: "+idade);
    }

    @Override
    public double resolverProva() {
        System.out.println(this.nome +" "+ f.format(numero));
        return numero;
    }
    
    
    
    
}

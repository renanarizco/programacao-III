/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author omar2
 */
public class Main {
    
    public static void testHeranca(List<Professor> professores, List<Estudante> estudantes) {
        System.out.println("======================== Test de Heranca =========================");
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.addAll(estudantes);
        pessoas.addAll(professores);
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa pessoa = pessoas.get(i);
            System.out.println("-----------------------------");
            System.out.println("Pessoa: ");
            pessoa.printaAttributos();
            System.out.println("");
            if(pessoa instanceof Estudante){
                System.out.println("Sou estudante");                
            }else if(pessoa instanceof Professor){
                System.out.println("Sou professor");   
            }
        }
        System.out.println("======================================================\n");
    }
    
    public static void testPolimorfismo(List<Professor> professores, List<Estudante> estudantes) {
        System.out.println("======================== Test de Polimorfismo =========================");
        Disciplina disciplinaProgramacao = new Disciplina("Programacao orientada a Objetos", professores.get(0));
        for (int i = 0; i < estudantes.size(); i++) {
            if (i % 2 == 0) {
                disciplinaProgramacao.cadastrarEstudante(estudantes.get(i));
            }
        }
        disciplinaProgramacao.fazerProva();
        
        Disciplina disciplinaDados = new Disciplina("Estrutura de Dados", professores.get(1));
        for (int i = 0; i < estudantes.size(); i++) {
            if (i % 2 != 0) {
                disciplinaDados.cadastrarEstudante(estudantes.get(i));
            }
        }
        disciplinaDados.fazerProva();
        
        Disciplina disciplinaMatematica = new Disciplina("Matematica", professores.get(2));
        for (int i = 0; i < estudantes.size(); i++) {
            disciplinaMatematica.cadastrarEstudante(estudantes.get(i));
        }
        disciplinaMatematica.fazerProva();
        System.out.println("======================================================\n");
    }
    
    public static void main(String[] args) {
        List<Professor> professores = new ArrayList<>();
        professores.add(new Professor("Omar"));
        professores.add(new Professor("Jean"));
        professores.add(new Professor("Adriana"));
        
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Carlos", 18));
        estudantes.add(new Estudante("Iranildo", 19));
        estudantes.add(new Estudante("Bruno", 20));
        estudantes.add(new Estudante("Caique", 17));
        estudantes.add(new Estudante("Geovana", 16));
        estudantes.add(new Estudante("Igor", 17));
        estudantes.add(new Estudante("Sebastiao", 15));
        estudantes.add(new Estudante("Antonio", 18));
        estudantes.add(new Estudante("Beatriz", 17));
        
        testHeranca(professores, estudantes);
        System.out.println("");
        System.out.println("");
        testPolimorfismo(professores, estudantes);
    }
    
}

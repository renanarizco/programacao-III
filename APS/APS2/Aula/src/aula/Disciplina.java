/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omar2
 */
public class Disciplina {
    private String nomeDisciplina;
    private AvaliadorInterface professor;
    private List<AvaliadoInterface> listaEstudante;

    public Disciplina(String nomeDisciplina,AvaliadorInterface professor) {
        this.nomeDisciplina = nomeDisciplina;
        this.professor = professor;
        listaEstudante = new ArrayList<>();
    }
    
    public void cadastrarEstudante(AvaliadoInterface estudante){
        listaEstudante.add(estudante);
    }
    
    public void fazerProva(){
        System.out.println("------------------Prova------------------");
        System.out.println("Disciplina: " + this.nomeDisciplina);
        this.professor.fazerProva();
        double notaMedia = 0;
        for (int i = 0; i < listaEstudante.size(); i++) {
            AvaliadoInterface estudante = listaEstudante.get(i);
            notaMedia += estudante.resolverProva();
            
        }
        System.out.printf("Nota media: %.2f\n",(notaMedia/listaEstudante.size()));
        System.out.println("-----------------------------------------\n");
    }
    
}

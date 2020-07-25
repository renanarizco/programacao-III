/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;


/**
 *
 * @author augus
 */
public class Pais {
   private String Nome;
   private String Dominio;
   private String Capital;
   private String Regiao;
   private String Lingua;
   private String Moeda;

    public Pais() {
        
    } 
    
    
    
    //Getter e Setters

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDominio() {
        return Dominio;
    }

    public void setDominio(String Dominio) {
        this.Dominio = Dominio;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String Capital) {
        this.Capital = Capital;
    }

    public String getRegiao() {
        return Regiao;
    }

    public void setRegiao(String Regiao) {
        this.Regiao = Regiao;
    }

    public String getLingua() {
        return Lingua;
    }

    public void setLingua(String Lingua) {
        this.Lingua = Lingua;
    }

    public String getMoeda() {
        return Moeda;
    }

    public void setMoeda(String Moeda) {
        this.Moeda = Moeda;
    }
    
    
 
//CONSTRUTOR

    public Pais(String Nome, String Dominio, String Capital, String Regiao, String Lingua, String Moeda) {
        this.Nome = Nome;
        this.Dominio = Dominio;
        this.Capital = Capital;
        this.Regiao = Regiao;
        this.Lingua = Lingua;
        this.Moeda = Moeda;
    }

    @Override
    public String toString() {
        return "Pais{" + "Nome=" + Nome + ", Dominio=" + Dominio + ", Capital=" + Capital + ", Regiao=" + Regiao + ", Lingua=" + Lingua + ", Moeda=" + Moeda + '}';
    }
    
}
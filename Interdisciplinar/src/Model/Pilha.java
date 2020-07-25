package Model;
public class Pilha {
    int topo = 0; //topo é 0 pois a pilha inicia na posição 0
    
    String[] vetor = new String[200];
    
    public boolean Cheia(){
        return(topo == 200); //a pilha tem limite de 200 cadastros
    }
    
    public boolean Vazia(){
        return(topo == 0); //retorna true se for vazia
    }
    
    public void Inserir(String Inserir){
        if(Cheia()){ 
            System.out.println("A pilha esta Cheia!!");
        }else{
            this.vetor[this.topo] = Inserir;
            topo++;
        }
    }
    
    public String Remover(){ //remove a ultima informação inserida na pilha
        String valor;
        if(Vazia()){
            System.out.println("A pilha esta vazia!!"); 
            return null;
        }else{
            valor = this.vetor[this.topo-1];
            System.out.println("Item Removido"); //mostra que um item foi removido
            topo--;
            return valor;
        }
    }
}

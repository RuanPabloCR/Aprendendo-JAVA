package src;
public class Leao extends Animal {
    
    public Leao(String nome, int idade, double peso, String cor) {
        super(nome, idade, peso, cor);
        
    }

    public void rugir(){
        System.out.println("O leao esta rugindo...");
    }
}

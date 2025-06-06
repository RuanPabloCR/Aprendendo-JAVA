package src;
public class Program {
    public static void main(String[] args) {
        Leao leao = new Leao("Simba", 5, 190.5, "Amarelo");
        System.out.println("Nome: " + leao.getNome());
        leao.rugir();
        
    }
}
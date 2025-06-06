package POO.Exercicios;
//import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Utils {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String frase = scanner.nextLine();
       boolean result = moderar(frase);
       System.out.println("Resultado da moderação: " + result);


       scanner.close();
    }

    public static boolean moderar(String frase){
        int i = 0;
        ArrayList<String> palavroes = getPalavroes();
        frase = frase.trim();
        frase = frase.toLowerCase();
        String[] palavras = frase.split(" ");
        for(String s : palavras)
        {
            if (palavroes.contains(s)) {
                System.out.println("Palavrão detectado: " + s);
                i++; // Retorna true se encontrar um palavrão
            }
        }
        if(i > 0){
            System.out.println("A frase contém " + i + " palavrões.");
            return true; // Retorna true se encontrar um ou mais palavrões
        }

        return false;
    }
    public static ArrayList<String> getPalavroes() {
        ArrayList<String> palavroes = new ArrayList<>();
        palavroes.add("teste");
        palavroes.add("testes");
        palavroes.add("testess");
        // Adicione mais palavrões conforme necessário
        return palavroes;
    }
}

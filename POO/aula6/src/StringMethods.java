package POO.aula6.src;
import java.util.Scanner;

public class StringMethods {
    public static void main(String []args){
        String a = new String("Casa");
        String b = new String("Casa");
        System.out.println(b==a);
        String c = "casa";
        String d = "Casa";
        System.out.println(c==d);
        String e = "casa";
        String f = new String("casa");
        System.out.println(e==f); // Vão dar false, pois e é uma string literal e f é um objeto String criado com o construtor.
        System.out.println(e.equals(f)); // true, pois o método equals compara o conteúdo das strings.
        System.out.println(a.equals(b)); // true, pois o conteúdo de a e b é o mesmo.
        //System.out.println(a.equalsIgnoreCase(b)); // true, pois ignora diferenças de maiúsculas e minúsculas.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        palavra = palavra.trim(); // Remove espaços em branco no início e no final
        String [] palavras = palavra.split(" "); // Divide a string em palavras
        for (String p : palavras) {
            System.out.println("Palavra: " + p);
        }
    }
}
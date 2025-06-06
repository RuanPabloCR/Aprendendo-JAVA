package POO.Exercicios.Planta2;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaPrincipal {
    public static void main(String[] args) {
        ArrayList plantasCad = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();

        Planta temp = new Planta(id);

        if(Utils.existe(plantasCad, temp)){
           for (Object obj : plantasCad) {
                Planta p = (Planta) obj;
                if (p.id == id) {
                    System.out.println(p.toString());
                    break;
                }
        }
        }
        else{
            System.out.println("Planta com ID" + id + " nao encontrada.");
        }
        Planta[] plantasOrdenadas = Utils.ordena(plantasCad);
        System.out.println("Plantas ordenadas por tamanho:");
        for (Planta p : plantasOrdenadas) {
            System.out.println(p.toString());
        }
    }
}

import java.util.ArrayList;
public class Program {
    public static void main(String[] args){
        System.out.println("PROVA - Veículos Aquáticos");
        ArrayList veiculos = new ArrayList();
        veiculos.add(new Moto("Moto 1", 2015, 15000.0));
        veiculos.add(new Carro("Carro 1", 2018, 50000.0));
        veiculos.add(new Lancha("Lancha 1", 2017, 200000.0));
        veiculos.add(new Lancha("Lancha 2", 2019, 180000.0));
        Concessionaria concessionaria = new Concessionaria();
        double valorTotal = concessionaria.calcular(veiculos);
        System.out.println("Valor total dos veículos: " + valorTotal);
    }
}

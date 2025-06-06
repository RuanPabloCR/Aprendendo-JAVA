import java.util.ArrayList;
public class Concessionaria {
    public static final int ANO_CORRENTE = 2019;

    private double valorTotalEmVeiculos = 0;

    public double calcular(ArrayList veiculos){
        for(Object obj : veiculos){
            if(obj instanceof Veiculo){
                Veiculo veiculo = (Veiculo) obj;
                valorTotalEmVeiculos += veiculo.calcularPrecoDeVenda();
            }
        }
        return valorTotalEmVeiculos;
    }
}

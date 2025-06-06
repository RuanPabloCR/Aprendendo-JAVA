public class Moto extends VeiculoTerrestre {
    private int cilindrada;
    public Moto(String descricao, int anoFabricacao, double valorveiculoNovo) {
        super(descricao, anoFabricacao, valorveiculoNovo);
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}

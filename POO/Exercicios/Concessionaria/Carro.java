public class Carro extends VeiculoTerrestre {
    public int qtdDeRodas;
    public Carro(String descricao, int anoFabricacao, double valorveiculoNovo) {
        super(descricao, anoFabricacao, valorveiculoNovo);
    }
    public int getQtdDeRodas() {
        return qtdDeRodas;
    }
    public void setQtdDeRodas(int qtdDeRodas) {
        this.qtdDeRodas = qtdDeRodas;
    }
    
}
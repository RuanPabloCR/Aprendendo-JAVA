public class Jetski extends VeiculoAquatico {
    private String modelo;
    public Jetski(String descricao, int anoFabricacao, double valorveiculoNovo) {
        super(descricao, anoFabricacao, valorveiculoNovo);
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double calcularPrecoDeVenda() {
        double precoVenda = getValorveiculoNovo();
        int periodo = Concessionaria.ANO_CORRENTE - getAnoFabricacao();
        for(int i = 0; i < periodo; i++) {
            precoVenda = precoVenda - precoVenda * 0.03; // 5% de desvalorização por ano
        }
        return precoVenda;
    }
}

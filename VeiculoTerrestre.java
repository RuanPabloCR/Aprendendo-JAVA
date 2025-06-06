public abstract class VeiculoTerrestre extends Veiculo{
    private String placa;
    public VeiculoTerrestre(String descricao, int anoFabricacao, double valorveiculoNovo) {
        super(descricao, anoFabricacao, valorveiculoNovo);    
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public double calcularPrecoDeVenda() {
        double precoVenda = getValorveiculoNovo();
        int periodo = Concessionaria.ANO_CORRENTE - getAnoFabricacao();
        for(int i = 0; i < periodo; i++) {
            precoVenda = precoVenda - precoVenda * 0.02; // 10% de desvalorização por ano
        }
        return precoVenda;
    }
}
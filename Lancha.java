public class Lancha extends VeiculoAquatico {
    private int qntdDePassageiros;
    public Lancha(String descricao, int anoFabricacao, double valorveiculoNovo) {
        super(descricao, anoFabricacao, valorveiculoNovo);
    }
    public int getQntdDePassageiros() {
        return qntdDePassageiros;
    }
    public void setQntdDePassageiros(int qntdDePassageiros) {
        this.qntdDePassageiros = qntdDePassageiros;
    }
    public double calcularPrecoDeVenda() {
        double precoVenda = getValorveiculoNovo();
        int periodo = Concessionaria.ANO_CORRENTE - getAnoFabricacao();
        for(int i = 0; i < periodo; i++) {
            precoVenda = precoVenda - precoVenda * 0.05; // 10% de desvalorização por ano
        }
        return precoVenda;
    }
}

public abstract class Veiculo {
    private String descricao; 
    private int anoFabricacao;
    private double valorveiculoNovo;

    public Veiculo(String descricao, int anoFabricacao, double valorveiculoNovo) {
        this.descricao = descricao;
        this.anoFabricacao = anoFabricacao;
        this.valorveiculoNovo = valorveiculoNovo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public double getValorveiculoNovo() {
        return valorveiculoNovo;
    }

    public abstract double calcularPrecoDeVenda();

    public String toString() {
        return 
                "descricao='" + descricao + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", valorveiculoNovo=" + valorveiculoNovo;
    }
}

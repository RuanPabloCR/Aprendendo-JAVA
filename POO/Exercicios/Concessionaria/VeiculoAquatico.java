
public abstract class VeiculoAquatico extends Veiculo {
    public int potenciaMotor;
    public VeiculoAquatico(String descricao, int anoFabricacao, double valorveiculoNovo) {
        super(descricao, anoFabricacao, valorveiculoNovo);
    }
    public int getPotenciaMotor() {
        return potenciaMotor;
    }
    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }
}

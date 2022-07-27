package Classe_Veiculo;

public class Automovel extends Veiculo {

    @Override
    public float acelerar(float velocidade) {
        this.velocidade += velocidade;
        return this.velocidade;
    }

    @Override
    public void parar() {
        this.velocidade = 0;
    }

    public void mudarOleo(float litros) {
        this.oleo = litros;
    }
}

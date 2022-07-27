package Classe_Veiculo;

public class Bicicleta extends Veiculo {

    @Override
    public float acelerar(float velocidade) {
        this.velocidade += velocidade;
        return this.velocidade;
    }

    @Override
    public void parar() {
        this.velocidade = 0;
    }

}

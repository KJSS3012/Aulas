package Classe_Veiculo;

public abstract class Veiculo {

    protected float velocidade;
    protected float oleo;

    public abstract float acelerar(float velocidade);

    public abstract void parar();
}

package Prova_Sistema_Escolar;

public class Aluno extends Pessoa {
    private int qdtFaltas;
    private float[] faltas = new float[4];

    public int getQdtFaltas() {
        return qdtFaltas;
    }

    public void setQdtFaltas(int qdtFaltas) {
        this.qdtFaltas = qdtFaltas;
    }

    public float[] getFaltas() {
        return faltas;
    }

    public void setFaltas(float[] faltas) {
        this.faltas = faltas;
    }

}
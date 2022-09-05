package Prova_Sistema_Escolar;

public class Professor extends Pessoa {
    private String disciplina;

    Professor() {
        this.disciplina = null;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

}

package Prova_Sistema_Escolar;

import java.util.ArrayList;

public class Turma {
    private Professor professor;
    private ArrayList<Aluno> aluno;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(ArrayList<Aluno> aluno) {
        this.aluno = aluno;
    }

}

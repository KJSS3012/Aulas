package Prova_Sistema_Escolar;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Thread;

public class Secretaria {
    private ArrayList<Aluno> alunoList = new ArrayList<>();
    private ArrayList<Professor> professorList = new ArrayList<>();
    private ArrayList<Disciplina> disciplinaList = new ArrayList<>();
    private Scanner in = new Scanner(System.in);

    public void cadastrarAlunos() throws InterruptedException {
        System.out.println("\033[H\033[2J");
        timer("ALUNOS");
        System.out.println("\nQuantos alunos deseja cadastrar?");
        int resposta = in.nextInt();
        Aluno[] alunos = new Aluno[resposta];
        for (int i = 0; i < resposta; i++) {
            System.out.println("\nDigite o nome do Aluno " + i + 1);
            alunos[i].setNome(in.nextLine());
            System.out.println("\nDigite o cpf do Aluno " + i + 1);
            alunos[i].setCpf(in.nextLine());
            System.out.println("\nDigite a matrícula do Aluno " + i + 1);
            alunos[i].setMatricula(in.nextLine());
            alunoList.add(alunos[i]);
        }
        System.out.println("\033[H\033[2J");
        System.out.println("Todos os alunos cadastrados");
        for (int i = 0; i < alunoList.size(); i++) {
            System.out.println("\n" + i + 1 + ") Nome: " + alunoList.get(i).getNome());
            System.out.print(" CPF: " + alunoList.get(i).getCpf());
            System.out.print(" Matricula: " + alunoList.get(i).getMatricula());
        }
        System.out.println("Sistema encerrado");
    }

    public void cadastrarProfessor() throws InterruptedException {
        System.out.println("\033[H\033[2J");
        timer("PROFESSOR(A)");
        System.out.println("\nQuantos professores deseja cadastrar?");
        int resposta = in.nextInt();
        Professor[] professores = new Professor[resposta];
        Disciplina[] disciplinas = new Disciplina[resposta];
        for (int i = 0; i < professores.length; i++) {
            System.out.println("\nDigite o nome do Professor " + i + 1);
            professores[i].setNome(in.nextLine());
            System.out.println("\nDigite o cpf do Professor " + i + 1);
            professores[i].setCpf(in.nextLine());
            System.out.println("\nDigite a matrícula do Professor " + i + 1);
            professores[i].setMatricula(in.nextLine());
            System.out.println("\nDigite a disciplina do Professor " + i + 1);
            professores[i].setDisciplina(in.nextLine());
            professorList.add(professores[i]);
            verificarDisciplina(professores[i].getDisciplina(), disciplinas[i]);
        }
        System.out.println("\033[H\033[2J");
        System.out.println("Todos os profesores cadastrados");
        for (int i = 0; i < professorList.size(); i++) {
            System.out.println("\n" + i + 1 + ") Nome: " + alunoList.get(i).getNome());
            System.out.print(" CPF: " + professorList.get(i).getCpf());
            System.out.print(" Matricula: " + professorList.get(i).getMatricula());
            System.out.print(" Disciplina: " + professorList.get(i).getDisciplina());
        }
        System.out.println("Sistema encerrado");
    }

    public void cadastrarDisciplina() throws InterruptedException {
        System.out.println("\033[H\033[2J");
        timer("DISCIPLINA");
        System.out.println("\nQuantas Disciplinas deseja cadastrar?");
        int resposta = in.nextInt();
        Disciplina[] disciplinas = new Disciplina[resposta];
        for (int i = 0; i < disciplinas.length; i++) {
            System.out.println("\nDigite o nome da disciplina " + i + 1);
            verificarDisciplina(in.nextLine(), disciplinas[i]);
        }
        System.out.println("\033[H\033[2J");
        System.out.println("Todos as disciplinas cadastradas");
        for (int i = 0; i < disciplinaList.size(); i++) {
            System.out.println("\n" + i + 1 + ") Nome: " + disciplinaList.get(i).getNome());
        }
        System.out.println("Sistema encerrado");
    }

    public void cadastrarTurma() throws InterruptedException {
        System.out.println("\033[H\033[2J");
        timer("TURMA");
    }

    public void timer(String tipoSistema) throws InterruptedException {
        System.out.println("##---INICIANDO O SISTEMA DE CADASTRAR " + tipoSistema + "---##");
        Thread.sleep(1000);
        System.out.println(".");
        Thread.sleep(1000);
        System.out.println(".");
        Thread.sleep(1000);
        System.out.println("\033[H\033[2J");
    }

    public void verificarDisciplina(String disciplinaNome, Disciplina disciplinas) {
        for (Disciplina disciplina : disciplinaList) {
            if (!disciplina.getNome().equalsIgnoreCase(disciplinaNome)) {
                disciplina.setNome(disciplinaNome);
                disciplinaList.add(disciplina);
            }
        }
    }
}

package Prova_Sistema_Escolar;

import java.util.Scanner;

public class Diretoria {

    private static Scanner in = new Scanner(System.in);
    private static Secretaria secretaria = new Secretaria();
    private static boolean isReturn = false;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("\nBem-Vindo ao IFRN!\n");
        while (!isReturn) {
            isReturn = true;
            System.out.println("##----------OPÇÕES-----------##");
            System.out.println("|-----------------------------|");
            System.out.println("| 1)  Cadastrar Estudante     |");
            System.out.println("| 2)  Cadastrar Professor     |");
            System.out.println("| 3)  Cadastrar Disciplina    |");
            System.out.println("| 4)  Cadastrar Turma         |");
            System.out.println("| 5)  Encerrar Sistema        |");
            System.out.println("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");
            int resposta = in.nextInt();

            switch (resposta) {
                case 1:
                    secretaria.cadastrarAlunos();
                    break;
                case 2:
                    secretaria.cadastrarProfessor();
                    break;
                case 3:
                    secretaria.cadastrarDisciplina();
                    break;
                case 4:
                    secretaria.cadastrarTurma();
                    break;
                case 5:
                    System.out.println("Sistema Encerrado");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\033[H\033[2J");
                    System.out.println("##-------OPÇÃO INVÁLIDA------##\n");
                    isReturn = false;
                    break;
            }
            isReturn = false;
        }
    }
}

package br.uniesp.poo.aula04;

import java.util.Scanner;

public class GeradorMediaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu curso: ");
        String nomeCurso = scanner.nextLine();
        System.out.println("Digite seu periodo: ");
        int numeroPeriodo = scanner.nextInt();
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a quantidade de faltas: ");
        int qtdFaltas = scanner.nextInt();

        aluno.setNome(nome);


    }
}

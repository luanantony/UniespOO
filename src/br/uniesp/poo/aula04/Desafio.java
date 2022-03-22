package br.uniesp.poo.aula04;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomeCompleto;
        String nomeCurso;
        int periodo;
        double primeiraNota;
        double segundaNota;
        int qtdFaltas;
        double media;

        System.out.println("Entre com seu nome completo: ");
        nomeCompleto = scan.nextLine();

        System.out.println("Entre com seu curso: ");
        nomeCurso = scan.nextLine();

        System.out.println("Entre com seu periodo: ");
        periodo = scan.nextInt();

        System.out.println("Entre com sua primeira nota: ");
        primeiraNota = scan.nextDouble();

        System.out.println("Entre com sua segunda nota: ");
        segundaNota = scan.nextDouble();

        System.out.println("Entre com a quantidade de faltas: ");
        qtdFaltas = scan.nextInt();


        System.out.println("Seu nome completo é: " + nomeCompleto +"\nSeu curso é: "+ nomeCurso);
        System.out.println("Seu periodo é: " + periodo + "\nSua primeira nota é: "+primeiraNota);
        System.out.println("Sua segunda nota é: " + segundaNota + "\nVocê teve " + qtdFaltas + "faltas.");

        media = (primeiraNota + segundaNota) /2;

        System.out.println("A média das notas é: " + media);

        scan.close();

    }
}

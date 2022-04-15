package br.uniesp.poo.exercicios;

import java.util.Scanner;
import java.util.Random;

public class TedWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroAleatorio = aleatorio.nextInt(10);
        int numeroEntrada;
        int tentativas = 1;

        System.out.println("Entre com um número de 0 a 10: ");
        numeroEntrada = scan.nextInt();


        while (numeroEntrada > numeroAleatorio) {
            System.out.println("Errou. Tente um número menor.");
            tentativas++;

            System.out.println("Entre com um número de 0 a 10: ");
            numeroEntrada = scan.nextInt();
        }

        while (numeroEntrada < numeroAleatorio){
            System.out.println("Errou. Tente um número maior.");
            tentativas++;

            System.out.println("Entre com um número de 0 a 10: ");
            numeroEntrada = scan.nextInt();
        }

        if (numeroEntrada==numeroAleatorio){
            System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
        }


    }
}
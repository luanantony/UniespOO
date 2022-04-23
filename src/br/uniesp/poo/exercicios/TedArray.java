package br.uniesp.poo.exercicios;

import java.util.Scanner;

public class TedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menorNum = 0, maiorNum = 0, soma = 0, somaPares = 0;

        int[] numeros = new int[10]; //Inicializando o array

        for (int i=0; i< numeros.length; i++){
            System.out.println("Entre com o número " + (i+1) + ": "); // Entrada de dados
            numeros[i] = scan.nextInt();

            if (i == 0) {   //Verificando primeiro valor e armazenando no vetor
                maiorNum = numeros[i];
                menorNum = numeros[i];
            }
            //Processando menor e maior numero, soma e soma de pares.
            if (numeros[i] < menorNum){
                menorNum = numeros[i];
            } else if (numeros[i] > maiorNum){
                maiorNum = numeros[i];
            }
            soma = soma + numeros[i];

            if (numeros[i]%2 == 0){
                somaPares = somaPares + numeros[i];
            }

        }
        //Imprimindo resultados
        System.out.println("O menor valor é: " + menorNum);
        System.out.println("O maior valor é: " + maiorNum);
        System.out.println("A soma de todos os números é: " + soma);
        System.out.println("A soma de todos os números pares é: " + somaPares);

    }
}

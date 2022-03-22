package br.uniesp.poo.aula02;


import java.util.Scanner;

public class LerNome {
    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com seu nome: ");
        nome = entrada.next();

        System.out.println("Entre com sua idade: ");
        idade = entrada.nextInt();

        System.out.println("Seu nome é: " + nome);

        System.out.println("Sua idade é: " + idade);

        entrada.close();

    }
}

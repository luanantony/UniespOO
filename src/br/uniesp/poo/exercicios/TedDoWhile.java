package br.uniesp.poo.exercicios;

import java.util.Scanner;

public class TedDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;          //Inicializando as variáveis
        int qtdLidos = 0;
        int qtdPositivos = 0;
        int qtdNegativos = 0;
        int soma = 0;
        double media;



        do {
            System.out.println("Informe um número inteiro (0 para sair): ");   //Lendo a entrada e iniciando o laço
            numero = scan.nextInt();

            if (numero != 0){   //Incrementando os lidos
                qtdLidos++;
            }

            if (numero > 0){   //Incrementando os positivos caso não, negativos.
                qtdPositivos++;
            } else if (numero < 0){
                qtdNegativos++;
            }

            soma += numero;  //Incrementando a soma.



        }while (numero!=0);  //Condição de fim de laço

        media = (soma * 1.0) / qtdLidos;  //Calculando a média em ponto flutuante.

        if (qtdLidos == 0){     //Condicional de tratamento para entrada válida.
            System.out.println("Não foi informado nenhum número.");
        }else {
            System.out.println("Quantidade de números positivos: " + qtdPositivos);   //Inprimindo resultados
            System.out.println("Quantidade de números negativos: " + qtdNegativos);
            System.out.println("A soma dos números lidos é: " + soma);
            System.out.println("A média aritmética é: " + media);
        }





    }
}

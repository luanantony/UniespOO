package br.uniesp.poo.exercicios;

import java.util.Scanner;

public class TedForIfElse {
    public static void main(String[] args) {
        int sexo;
        int qtdFem = 0;
        int qtdMasc = 0;
        double altura;
        double somaMasc = 0;
        double mediaMasc;
        double maiorAlt = 0;
        double menorAlt = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i<10; i++){
            System.out.println("Entre com o sexo 0 para feminino ou 1 para masculino: ");
            sexo = scan.nextInt();

            System.out.println("Entre com a altura: ");
            altura = scan.nextDouble();

            if (i == 0){
                menorAlt = altura;
                maiorAlt = altura;
            }

            if (sexo == 0){
                System.out.println("Pessoa do sexo feminino com " + altura + " de altura.");
                qtdFem++;
            }else if (sexo == 1){
                System.out.println("Pessoa do sexo masculino com " + altura + " de altura.");
                qtdMasc++;
                somaMasc = somaMasc + altura;
            }else {
                System.out.println("Entrada inválida. Tente novamente.");
            }
            if (altura < menorAlt){
                menorAlt = altura;
            } else if (altura > maiorAlt){
                maiorAlt = altura;
            }

        }

        mediaMasc = (somaMasc/qtdMasc);

        System.out.println("A maior altura é: " + maiorAlt + "m");
        System.out.println("A menor altura é: " + menorAlt + "m");
        System.out.println("A média dos homens é: " + mediaMasc + "m");
        System.out.println("A quantidade de mulheres é: " + qtdFem);

        scan.close();
    }

}

package br.uniesp.poo.aula04;

import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1, nota2, nota3;
        double soma = 0;
        double media;
        double recuperacao;
        double provaFinal;


        System.out.println("Entre com a primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        nota2 = scan.nextDouble();
        System.out.println("Entre com a terceira nota: ");
        nota3 = scan.nextDouble();

        soma = nota1 + nota2 + nota3;
        media = soma / 3;
        System.out.println("Sua media é: " + media);

        recuperacao = 10 - media + 2;
        provaFinal = 10 + media;



        if( (media >= 0) && (media <= 4.9) ){
            System.out.println("Está em recuperação.");
            System.out.println("Precisa de " + recuperacao + " para ser aprovado!");
        } else if( (media >= 5 ) && (media <= 6.9) ) {
            System.out.println("Aluno vai para prova final");
            System.out.println("Precisa de " + provaFinal + " para ser aprovado.");
        } else {
            System.out.println("Aprovado por média.");
        }



    }
}

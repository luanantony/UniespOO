package br.uniesp.poo.aula05;

public class Calculos {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(7, 8);
        int soma = calc.somar();
        System.out.println(soma);
        int sub = calc.subtrair();
        System.out.println(sub);

        int n = 5;
        int a = 2* n;
        System.out.println(a);

        int b=2;
        b +=4;

        System.out.println(b);
    }
}

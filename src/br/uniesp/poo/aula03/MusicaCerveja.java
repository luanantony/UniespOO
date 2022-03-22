package br.uniesp.poo.aula03;

import java.util.Scanner;

public class MusicaCerveja {
    public static void main(String[] args) {
        int cerveja = 99;
        Scanner scan = new Scanner(System.in);


       while (cerveja >= 1){
            cerveja -= 1;
           System.out.println("Pego uma garrafa, passo pra frente. \nAgora são " + cerveja + " no freezer");
           if (cerveja == 1){
               System.out.println("A cerveja está acabando! \nQuer incluir mais cerveja? Digite a quantidade: ");
               cerveja = scan.nextInt();
               if (cerveja > 0){
                   System.out.println("Foram incluidas mais " + cerveja + " cervejas.");
               }
           }
       }
       scan.close();


    }
}

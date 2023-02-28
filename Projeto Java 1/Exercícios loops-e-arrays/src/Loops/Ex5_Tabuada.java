package Loops;
/*Desenolva um gerador de tabuada, capaz de gerar 
a tabuada de qualquer número inteiro entre 1 e 10. */

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for(int count = 1; count <= 10; count++) {
            System.out.println(tabuada + "x" + count + "=" + (tabuada*count));

        }

    }
    
}

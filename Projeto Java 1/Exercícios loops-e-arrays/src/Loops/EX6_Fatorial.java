package Loops;

import java.util.Scanner;

/*Faça um programa que calcule o fatorial 
e um numero inteiro fornecido pelo usuário.
 */

public class EX6_Fatorial {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt() ;

        int multiplicação = 1;

        System.out.println(fatorial + "! = " );
        
        for (int i = fatorial; i >= 1; i --) {
            multiplicação = multiplicação * i;
        }
            
            System.out.println(multiplicação);
    
    }
    
}

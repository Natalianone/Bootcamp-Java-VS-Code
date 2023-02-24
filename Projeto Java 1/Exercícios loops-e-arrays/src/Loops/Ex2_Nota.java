package Loops;

import java.util.Scanner;

/*
Programa criado para o aluno saber se foi aprovado ou não, conforme sua nota (média 7).
Parâmetros: 
De 7-10 = aprovado.
<7 = reprovado.
*/

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        if (nota < 7) {
            System.out.println("Reprovado na prova! Tente novamente! ");
            nota = scan.nextInt();
        }
        while (nota >= 7) {
            System.out.println("Parabéns, fostes aprovado!");
            nota = scan.nextInt();
        }
            
        }

    }
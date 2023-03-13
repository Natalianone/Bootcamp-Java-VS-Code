//Programa para calcular o tempo necessário para ler um livro, conforme o número de páginas.

import java.util.Scanner; 
    
public class DesafioLeitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidasDia = 3;

        int nDias = paginas / paginasLidasDia;

        System.out.println(nDias + " dias");
    }
}
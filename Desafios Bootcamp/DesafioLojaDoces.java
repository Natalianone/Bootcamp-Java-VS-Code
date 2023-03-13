import java.util.Scanner; 
    
public class DesafioLojaDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        
        int nDoces = dinheiro * 2;
        
        System.out.println("O cliente obteve " + nDoces + " doces");
  
    }
}
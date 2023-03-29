import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class QuizReflexão {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Perguntas: ");
        System.out.print("\nSe a felicidade fosse a moeda nacional, você seria rico? ");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Pense no que mais gostaria de fazer para mudar o mundo. Você acha que pode começar isto? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Se a expectativa de vida humana fosse em média 40 anos, você viveria sua vida da mesma forma? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print(" Você tem se sentido apaixonado e vivo? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Você é o tipo de amigo que quer como amigo? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.printlnn(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("n")) {
                count --;
            }
        }

        switch(count) {
            case 2:
                System.out.println(">> Rico de Felicidade <<"); break;
            case 3:
            case 4:
                System.out.println(">> Tem fé no mundo, entusiasmo para mover montanhas e vive como gosta! <<"); break;
            case 5:
                System.out.println(">> Segue seu caminho com brilho e paixão! <<"); break;
            default:
                System.out.println(">> Olhe mais para si, cuide-se com amor! <<"); break;
        }
    }
}

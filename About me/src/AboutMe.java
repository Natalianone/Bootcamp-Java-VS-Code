public class AboutMe {
    public static void main(String[] args) {

        String nome = args [0];
        String apelido = args [1];
        int idade = Intereger.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + apelido);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm ");
        
    }
}

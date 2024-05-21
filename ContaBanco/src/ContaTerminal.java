import java.util.Locale;
import java.util.Scanner;


    public class ContaTerminal {
    public static void main(String[] args) {


      try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
        System.out.println("Digite seu usuário:");
        int usuario = scanner.nextInt();

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();


        System.out.println("Digite o número da conta:");
        String conta = scanner.next();
        
        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " "+ sobrenome + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " 
         + conta + ", conta "  + usuario + " e seu saldo " + saldo + 
         " já está disponível para saque.");
    }

    }
}
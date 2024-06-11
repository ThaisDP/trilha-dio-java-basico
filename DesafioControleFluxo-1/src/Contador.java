import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal= new Scanner(System.in);
        
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroum = terminal.nextInt();
        
        System.out.print("Digite o segundo parâmetro: ");
        int parametrodois = terminal.nextInt();
        
        try {
            if (parametroum >= parametrodois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
            
            for (int i = parametroum; i <= parametrodois; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super( mensagem);
    }
}
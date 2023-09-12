import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
   public static void main(String[] args) throws Exception {
        
        //TODO: conhecer e importar a classe Scanner
        //obter pela classe Scanner os valores digitados no terminal

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
 
        //exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta !");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite nome do cliente !");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo !");
        double saldo = scanner.nextDouble();

        //exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente.toUpperCase()
                            + ", obrigado por criar uma conta em nosso banco, sua agencia é "
                            + agencia + ", conta "
                            + numero + " e seu saldo "
                            + saldo + " já está disponivel para saque."                            
                            );

    }
}

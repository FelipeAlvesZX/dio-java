import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.print("Por favor, digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Por favor, digite o nome da agência: "); 
        String agencia = scanner.next();

        System.out.print("Digite o saldo da sua conta: ");
        Float saldo = scanner.nextFloat();


        System.out.println("Olá " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " 
        + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");



    }
}

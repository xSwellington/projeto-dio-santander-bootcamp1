import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String message = "Depois ENTER para o próximo campo: ";

        System.out.println("Por favor, digite o número da Conta.");
        System.out.println(message);
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência.");
        System.out.println(message);
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o Nome do cliente.");
        System.out.println(message);
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo.");
        double saldoConta = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ numeroAgencia +", conta "+ numeroConta +" e seu saldo "+ saldoConta +" já está disponível para saque.");
        scanner.close();
    }
}
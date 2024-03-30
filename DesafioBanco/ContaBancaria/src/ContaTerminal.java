import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número de sua conta: ");
        String numeroConta = scanner.next();

        System.out.println("Digite seu saldo: ");
        String saldo = scanner.next();


        System.out.println("Olá ".concat(nome).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(numeroConta).concat(" e seu saldo ").concat(saldo).concat(" já está disponível para saque."));
        scanner.close();
    }
}

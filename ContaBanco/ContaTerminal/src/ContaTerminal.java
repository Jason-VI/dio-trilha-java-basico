import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o Numero da sua Conta: ");
        var conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o numero da Agencia: ");
        var agencia = scanner.nextLine();

        System.out.println("Informe Seu Nome: ");
        var nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        var saldo = scanner.nextDouble();

        System.out.println("Ola " + nome + " Obrigado por criar uma conta em nosso banco." +
                " Sua agencia " + agencia + " conta " + conta + " com o saldo de R$ " + saldo + " ja esta disponivel para saque.");
        scanner.close();
    }
}

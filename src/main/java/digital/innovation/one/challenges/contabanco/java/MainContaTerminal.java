package digital.innovation.one.challenges.contabanco.java;
import java.util.Scanner;

public class MainContaTerminal {
    public static void main(String[] args) {

        String nomeCliente;
        int agencia;
        int conta;
        long saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** *** *** DIGITAL INNOVATION ONE *** *** *** \n" +
                "*** CHALLENGE - CONTA EM BANCO DIGITAL ***");

        System.out.println("Nova Conta no DIO Bank\nDigite o nome completo: ");
        nomeCliente = scanner.next();
        System.out.println("Digite o numero da conta: ");
        conta = scanner.nextInt();
        System.out.println("Digite o numero da agencia");
        agencia = scanner.nextInt();
        System.out.println("Digite o valor do primeiro deposito");
        saldo = scanner.nextInt();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco\n" +
                "Agência: %s\n" +
                "Conta: %s\n" +
                "Saldo Atual: %s\n" +
                "O valor de R$:"+ saldo + " em sua conta já está disponível para saque\"%n", nomeCliente, agencia, conta, saldo);
    }
}

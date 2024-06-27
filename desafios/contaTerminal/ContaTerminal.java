package contaTerminal;

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta");
        int numero = scanner.nextInt();

        System.out.println("Digite sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite Saldo");
        Double saldo = scanner.nextDouble();


        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de "+ saldo +" já está disponível para saque");

    }
}
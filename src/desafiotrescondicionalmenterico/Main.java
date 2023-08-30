package desafiotrescondicionalmenterico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();

        if (valorSaque > saldoTotal) {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        } else {
            saldoTotal -= valorSaque;
            System.out.printf("Saque realizado com sucesso. Novo saldo: %d", saldoTotal);
        }
    }
}
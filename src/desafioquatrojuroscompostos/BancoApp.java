package desafioquatrojuroscompostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();

        double taxaJuros = scanner.nextDouble();

        int periodo = scanner.nextInt();

        double valorFinal = valorInicial;

        valorFinal = calculadorDeJuros(valorInicial, taxaJuros, periodo);

        DecimalFormat format = new DecimalFormat("####.00");

        System.out.println("Valor final do investimento: R$ " + format.format(valorFinal));

        scanner.close();
    }

    static double calculadorDeJuros(double valorInicial, double taxaDeJuros, int periodo) {
        return valorInicial * Math.pow(1 + taxaDeJuros, periodo);
    }
}
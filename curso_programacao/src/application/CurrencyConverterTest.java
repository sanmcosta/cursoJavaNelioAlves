package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class CurrencyConverterTest {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter cc = new CurrencyConverter();

		char stop = 'n';

		do {
			System.out.println("What is the dollar price?");
			cc.precoDolar = sc.nextDouble();
			System.out.println("How many dollars will be bought?");
			cc.qteDolarComprado = sc.nextDouble();
			System.out.printf("Amount to be paid in reais = %.2f%n", cc.calculaValorPagoEmReais());
			System.out.println("Deseja continuar? s/n");
			stop = sc.next().charAt(0);
		} while (stop != 'n');
		sc.close();
	}

}

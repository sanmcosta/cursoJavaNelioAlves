package application;

import java.util.Locale;
import java.util.Scanner;

public class ArrayMediaAltura {

	public static void main(String[] args) {
		double media = 0;
		double soma = 0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o tamanho do array: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Informe a %d? altura: ", i + 1);
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		media = soma / vect.length;
		System.out.printf("A altura m?dia ?: %.2f%n", media);
		sc.close();
	}

}

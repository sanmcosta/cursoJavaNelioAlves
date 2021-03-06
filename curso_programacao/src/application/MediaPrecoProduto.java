package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class MediaPrecoProduto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double mediaPreco = 0;

		System.out.print("Informe a quantidade de produtos: ");
		// int qteProduto = sc.nextInt();
		Product[] vect = new Product[sc.nextInt()];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();// para consumir quebra de linha
			System.out.println("Informe o nome do produto: ");
			String nomeProduto = sc.nextLine();

			System.out.println("Informe o pre?o do produto: ");
			double precoProduto = sc.nextDouble();

			vect[i] = new Product(nomeProduto, precoProduto);
		}

		double somaPreco = 0.0;
		for (int i = 0; i < vect.length; i++) {
			somaPreco += vect[i].getPrice();
		}

		mediaPreco = somaPreco / vect.length;
		System.out.println("AVERANGE PRICE = " + mediaPreco);
		sc.close();
	}

}

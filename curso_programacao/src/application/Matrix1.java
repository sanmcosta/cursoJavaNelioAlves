package application;

import java.util.Scanner;

public class Matrix1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o n? de elementos: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		sc.nextLine();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				int valor = sc.nextInt();
				mat[i][j] = valor;
			}

		}

		System.out.println("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		int cont = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0)
					cont++;
			}
		}

		System.out.println();
		System.out.println("Negatives numbers =  " + cont);
		sc.close();
	}

}

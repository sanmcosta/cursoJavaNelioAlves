package application;

import java.util.Scanner;

public class Matrix2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o n�mero de linhas: ");
		int linha = sc.nextInt();
		sc.nextLine();

		System.out.println("Informe o n�mero de colunas: ");
		int coluna = sc.nextInt();

		sc.nextLine();

		int[][] vect = new int[linha][coluna];

		for (int i = 0; i < vect.length; i++) {
			for (int j = 0; j < vect[i].length; j++) {
				int valor = sc.nextInt();
				vect[i][j] = valor;
			}
		}

		int pesq = sc.nextInt();

		for (int i = 0; i < vect.length; i++) {
			for (int j = 0; j < vect[i].length; j++) {
				if (vect[i][j] == pesq) {
					System.out.printf("Posistion %d,%d:%n", i, j);

					// Left
					if (j > 0)
						System.out.printf("Left:%d%n", vect[i][j - 1]);

					// Up
					if (i > 0)
						System.out.printf("Up:%d%n", vect[i - 1][j]);

					// Right
					if (j < vect[i].length - 1)
						System.out.printf("Rigth:%d%n", vect[i][j + 1]);

					// Down
					if (i < vect.length - 1)
						System.out.printf("Down:%d%n", vect[i + 1][j]);

				}
			}
		}

		sc.close();
	}

}

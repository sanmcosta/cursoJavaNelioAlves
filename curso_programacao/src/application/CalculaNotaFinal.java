package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class CalculaNotaFinal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		char stop = 'n';

		do {
			System.out.println("Informe o nome do aluno: ");
			student.nome = sc.nextLine();
			System.out.println("Informe a 1ª nota: ");
			student.notasTrimeste[0] = sc.nextDouble();
			System.out.println("Informe a 2ª nota: ");
			student.notasTrimeste[1] = sc.nextDouble();
			System.out.println("Informe a 3ª nota: ");
			student.notasTrimeste[2] = sc.nextDouble();

			student.notaFinal();
			System.out.println(student);
			System.out.println("Deseja continuar? s/n");
			stop = sc.next().charAt(0);
			sc.nextLine();
		} while (stop != 'n');

		sc.close();

	}

}

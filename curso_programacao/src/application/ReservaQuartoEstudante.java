package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ReservaQuartoEstudante {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		Student[] quartos = new Student[10];
		int quartosReservados = sc.nextInt();

		for (int i = 0; i < quartosReservados; i++) {
			sc.nextLine();// para tirar a quebra de linha
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();

			quartos[room] = new Student(name, email, room);
		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null)
				System.out.printf("%d: %s, %s%n", quartos[i].room, quartos[i].nome, quartos[i].email);
		}
		sc.close();
	}

}

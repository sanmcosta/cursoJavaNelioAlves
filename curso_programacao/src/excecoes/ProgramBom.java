package excecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainExceptions;

public class ProgramBom {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		Date checkIn;
		Date checkOut;

		try {
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();

			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());

			Reservation reserva = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reserva);

			System.out.println();

			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());

			reserva.updateDates(checkIn, checkOut);
			System.out.println(reserva);
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		} catch (DomainExceptions e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Enter a valid integer value");
		}
		sc.close();
	}

}

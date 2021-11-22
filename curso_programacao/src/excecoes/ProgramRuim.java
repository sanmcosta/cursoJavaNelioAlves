package excecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class ProgramRuim {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		Date checkIn;
		Date checkOut;

		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();

		System.out.print("Check-in date (dd/MM/yyyy): ");
		checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		checkOut = sdf.parse(sc.next());
		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reserva = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reserva);

			System.out.println();

			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());

			String error = reserva.updateDates(checkIn, checkOut);
			if (error != null) {
				System.out.println(error);
			} else {
				System.out.println(reserva);
			}
		}
		sc.close();
	}

}

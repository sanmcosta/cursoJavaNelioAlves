package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order2;
import entities.Order2Item;
import entities.Product2;
import entities.enums.OrderStatus;

public class Order2Test {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birth = sdf.parse(sc.nextLine());
		Client client = new Client(name, email, birth);

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order2 order = new Order2(new Date(), status, client);

		System.out.print("How many items to this order?: ");
		Integer n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			String prodName = sc.nextLine();
			System.out.print("Product price: ");
			Double prodPrice = sc.nextDouble();
			Product2 product = new Product2(prodName, prodPrice);
			sc.nextLine();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();

			Order2Item orderItem = new Order2Item(quantity, prodPrice, product);
			order.addItem(orderItem);
		}

		System.out.println("\nORDER SUMMARY: ");
		System.out.println(order);
		sc.close();

	}

}

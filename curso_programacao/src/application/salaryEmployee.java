package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class salaryEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();

		System.out.println("Informe o nome : ");
		employee.setName(sc.nextLine());
		System.out.println("Informe o sal?rio bruto : ");
		employee.setGrossSalary(sc.nextDouble());
		System.out.println("Informe o imposto : ");
		employee.tax = sc.nextDouble();

		System.out.println("Employee: " + employee);

		System.out.println("Informe o percentual de aumento do sal?rio bruto : ");
		employee.increaseSalary(sc.nextDouble());

		System.out.println("Updated data: " + employee);
		sc.close();
	}

}

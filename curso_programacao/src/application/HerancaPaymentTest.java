package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca.Funcionario;
import heranca.Terceirizado;

public class HerancaPaymentTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.print("Informe o número de funcionários: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Funcionário #" + i + " data: ");
			System.out.print("É terceirizado (s/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Horas trabalhadas: ");
			int hours = sc.nextInt();
			System.out.print("Valor da hora: ");
			double valuePerHora = sc.nextDouble();
			if (ch == 's') {
				System.out.print("Carga adicional: ");
				double additionalCharge = sc.nextDouble();
				list.add(new Terceirizado(name, hours, valuePerHora, additionalCharge));
			} else {
				list.add(new Funcionario(name, hours, valuePerHora));
			}
		}

		System.out.println();
		System.out.println("Pagamentos: ");
		for (Funcionario func : list) {
			System.out.println(func.getName() + "- $" + String.format("%.2f", func.payment()));
		}
		sc.close();
	}

}

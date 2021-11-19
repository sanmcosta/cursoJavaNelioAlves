package classAbstract;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PessoaTest {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();

		System.out.print("Insira o número de contribuintes: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Contribuinte #" + i + ":");
			System.out.print("Pessoa fisica ou Pessoa Juridica (f / j)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaMensal = sc.nextDouble();
			if (ch == 'f') {
				System.out.print("Despesas com saúde: ");
				double despesasComSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaMensal, despesasComSaude));
			} else {
				System.out.print("Nº de funcionários: ");
				int qteFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaMensal, qteFuncionarios));
			}
		}

		System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");
		for (Pessoa pessoa : list) {
			System.out.printf("%s: $ %.2f%n", pessoa.getNome(), pessoa.calcImposto());
		}

		double sum = 0.0;
		for (Pessoa pessoa : list) {
			sum += pessoa.calcImposto();

		}
		System.out.println(String.format("%nTOTAL DE IMPOSTOS: $ %.2f", sum));
		sc.close();
	}

}

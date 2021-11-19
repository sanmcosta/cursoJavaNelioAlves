package application;

import heranca.Account;
import heranca.BusinessAccount;
import heranca.SavingsAccount;

public class HerancaTest {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING (atribuindo sublasse em uma superclasse)
		@SuppressWarnings("unused")
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING (atribuindo uma superclasse a uma subclasse, mas nem sempre dá
		// certo)
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		// BusinessAccount acc5 = (BusinessAccount) acc3; //dá erro na compilação pois
		// acc3 é do tipo SavingsAccount

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}

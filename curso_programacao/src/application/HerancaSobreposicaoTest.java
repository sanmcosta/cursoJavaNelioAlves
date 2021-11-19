package application;

import heranca.Account;
import heranca.BusinessAccount;
import heranca.SavingsAccount;

public class HerancaSobreposicaoTest {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());

		Account acc2 = new SavingsAccount(1001, "Alex", 1000.0, 0.01);// herança de account
		acc2.withdraw(200.0);// aqui é usado o polimorfismo
		System.out.println(acc2.getBalance());

		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);// herança de account
		acc3.withdraw(200.0);// aqui é usado o polimorfismo
		System.out.println(acc3.getBalance());

	}

}

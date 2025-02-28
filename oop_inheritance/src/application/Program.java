package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		// Account (Super Class)
		Account acc1 = new Account(1001, "Alex", 1000.00);
		acc1.withdraw(200.0);
		System.out.println("Saldo atual da conta 'Account': " + acc1.getBalance());

		// Testing Override
		// Savings Account -> Subclass of Account
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println("Saldo atual conta 'SavingAccount': " + acc2.getBalance());

		// Business account-> Subclass of Account
		// Usando o super() pra fazer a mesma coisa que Account.withdraw, mas depois
		// remover mais 2.0 do balance
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println("Saldo atual conta 'BusinessAccount': " + acc3.getBalance());

		// POLIMORFISMO:
		// Chamamos metodos na variavel do mesmo tipo
		// Porem elas tem comportamentos diferentes, uma instanciada com Account e outra com SavingsAccount
		// na quais tem metodos diferentes, withdraw na SavingsAccount is override, por isso vamos ter diferentes resultados
		// "Muitas formas"
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println("Balance x: " + x.getBalance());
		System.out.println("Balance y: " + y.getBalance());
	}

}

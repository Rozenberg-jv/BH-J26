package by.belhard.j26.homeworks.hw10.task4;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Task4 {

	public static void main(String[] args) {

		BankIO bankIO = new BankIO();
		Bank bank = new Bank();
		List<Transaction> transactions;

		try {
			// read balance
			Map<String, Account> accounts = bankIO.readAccountsData("resources/hw10/balance.dt");
			bank.addAccounts(accounts);

			// read transactions
			transactions = bankIO.readTransactions("resources/hw10/transactions.dt");

		} catch (IOException e) {
			System.err.println("Failure while reading data");
			return;
		}

		// try to proceed transactions
		bank.processTransactions(transactions);

		// additional info
		transactions.forEach(System.out::println);

		// sort and write to file
		try {
			bankIO.writeAccountData("resources/hw10/newbalance.out", bank.getAccountsSortedByName());
		} catch (IOException e) {
			System.err.println("Unable to write data");
		}
	}

}

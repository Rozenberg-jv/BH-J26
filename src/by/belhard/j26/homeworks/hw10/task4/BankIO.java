package by.belhard.j26.homeworks.hw10.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BankIO {

	public Map<String, Account> readAccountsData(String path) throws IOException {

		Map<String, Account> accounts = new TreeMap<>();

		BufferedReader rdr = new BufferedReader(new FileReader(path));

		String[] splitted;
		while (rdr.ready()) {
			splitted = rdr.readLine().split(" ");
			String name = splitted[0];
			int money = Integer.parseInt(splitted[1]);
			accounts.put(name, new Account(name, money));
		}

		rdr.close();

		return accounts;
	}

	public List<Transaction> readTransactions(String path) throws IOException {

		List<Transaction> transactions = new ArrayList<>();

		BufferedReader rdr = new BufferedReader(new FileReader(path));

		String[] splitted;
		while (rdr.ready()) {
			splitted = rdr.readLine().split(" ");
			String sender = splitted[0];
			String receiver = splitted[1];
			int amount = Integer.parseInt(splitted[2]);
			transactions.add(new Transaction(sender, receiver, amount));
		}

		rdr.close();

		return transactions;
	}

	public void writeAccountData(String path, List<Account> accountsSortedByName) throws IOException {

		BufferedWriter wrt = new BufferedWriter(new FileWriter(path));

		for (Account a : accountsSortedByName) {
			wrt.write(a.toString());
			wrt.newLine();
		}

		wrt.flush();
		wrt.close();
	}
}

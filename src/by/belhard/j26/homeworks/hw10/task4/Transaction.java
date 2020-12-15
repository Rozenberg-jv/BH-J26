package by.belhard.j26.homeworks.hw10.task4;

public class Transaction {

	private final String sender;
	private final String receiver;
	private final int amount;
	private TransactionStatus status;

	public Transaction(String sender, String receiver, int amount) {

		this.sender = sender;
		this.receiver = receiver;
		this.amount = amount;
		this.status = TransactionStatus.UNHANDLED;
	}

	public String getSender() {

		return sender;
	}

	public String getReceiver() {

		return receiver;
	}

	public int getAmount() {

		return amount;
	}

	public void setStatus(TransactionStatus status) {

		this.status = status;
	}

	public boolean isValid() {

		return !status.name().startsWith("INVALID");
	}

	@Override
	public String toString() {

		return String.format("Transaction [from: %s, to: %s, amount: %d, status: %s]", sender, receiver, amount, status);
	}
}

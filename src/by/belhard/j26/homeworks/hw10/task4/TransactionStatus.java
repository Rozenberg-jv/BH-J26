package by.belhard.j26.homeworks.hw10.task4;

/**
 * "INVALID_" is the mandatory prefix for invalid transactions
 */
public enum TransactionStatus {

	UNHANDLED,
	INPROCESS,
	DONE,
	INVALID_NOT_ENOUGH_MONEY,
	INVALID_NO_SUCH_ACCOUNT,
	INVALID_AMOUNT_VALUE
}

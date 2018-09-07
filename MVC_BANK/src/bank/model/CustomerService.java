package bank.model;

import bank.db.Customer;

public class CustomerService {

	public static int doDepositAmount(Customer c) {
	int status = 0;
	
	double balance = CustomerDao.getBalance(c);
	
	if (balance ==  -1)
	{
		return -1;
	}
	
	double amount = balance + c.getAmount();
	c.setAmount(amount);
	status = CustomerDao.updateDeposit(c);
	
		return status;
	}

}

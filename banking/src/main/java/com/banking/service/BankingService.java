package com.banking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.banking.dto.Account;
import com.banking.dto.Transaction;

/**
 * Banking Service Interface
 * @author Gautham Bhonsle
 *
 */
public interface BankingService {

	/**
	 * Method to fetch all accounts
	 * @return
	 */
	public List<Account> getAccounts();

	/**
	 * Method to fetch all transactions for an account
	 * @param accountNumber
	 * @return
	 */
	public List<Transaction> getTransactionsByAccountNos(int accountNumber);

}

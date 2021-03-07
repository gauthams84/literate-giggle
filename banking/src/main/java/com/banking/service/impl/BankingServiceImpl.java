package com.banking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.banking.dao.AccountRepo;
import com.banking.dao.TransactionRepo;
import com.banking.dto.Account;
import com.banking.dto.Transaction;
import com.banking.service.BankingService;
/**
 * Method for all Banking releated service calls
 * @author Gautham Bhonsle
 *
 */
@Service
public class BankingServiceImpl  implements BankingService{
	
	@Autowired
	AccountRepo accountRepo;
	
	@Autowired
	TransactionRepo transactionRepo;

	/**
	 * Mehod to retrieve all accounts
	 */
	@Override
	public List<Account> getAccounts() {
		return accountRepo.findAll();
	}

	/**
	 * Method to retrieve transactions for an account number
	 */
	@Override
	public List<Transaction> getTransactionsByAccountNos(int accountNumber) throws DataAccessException{
		return transactionRepo.getTransactionsByAccountNos(accountNumber);
	}

}

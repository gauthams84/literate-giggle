package com.banking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.dto.Account;
import com.banking.dto.Transaction;
import com.banking.exception.RecordNotFoundException;
import com.banking.service.BankingService;

/**
 * Rest Controller class for all Banking related queries
 * 
 * @author Gautham Bhonsle
 *
 */
@RestController
@RequestMapping("/banking")
public class BankingController {

	@Autowired
	BankingService bankingService;

	/**
	 * Method to fetch list of all accounts
	 * 
	 * @return <List>Account
	 */
	@GetMapping("/accounts")
	public List<Account> getAccounts() {
		return bankingService.getAccounts();
	}

	/**
	 * Method to fetch all transactions for a given account number
	 * 
	 * @param accountNumber
	 * @return List<Transaction>
	 */
	@GetMapping("/transactions/{accountNumber}")
	public List<Transaction> getTransactions(@PathVariable("accountNumber") int accountNumber) {
		List<Transaction> transactions = null;
		
		transactions = bankingService.getTransactionsByAccountNos(accountNumber);
		
		// Throw exception if no records found for a account number
		if (transactions.isEmpty()) {
			throw new RecordNotFoundException("No Transactions for Account " + accountNumber);
		}

		return transactions;
	}

}

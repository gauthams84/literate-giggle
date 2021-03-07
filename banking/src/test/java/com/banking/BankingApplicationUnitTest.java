package com.banking;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.banking.dto.Account;
import com.banking.dto.Transaction;
import com.banking.service.BankingService;

/**
 * Unit tests
 * @author Gautham Bhonsle
 *
 */
public class BankingApplicationUnitTest {
	
	@Mock
	BankingService bankingService;
	
	@InjectMocks
	BankingController bankingController;
	
	public static int ACCOUNT_NUMBER = 1234;
	List<Account> accounts;
	Account acc;
	Account acc1;
	
	List<Transaction> transactions;
	Transaction transaction1;
	Transaction transaction2;
	
	@SuppressWarnings("deprecation")
	@BeforeEach
	void setUp() throws Exception{
		MockitoAnnotations.initMocks(this);
		
		acc = new Account();
		acc.setAccountNumber(ACCOUNT_NUMBER);
		acc.setAccountName("abc");
		acc.setAccountBalance(600.00);
		acc.setCurrency("AUD");
		
		acc1 = new Account();
		acc1.setAccountNumber(234);
		acc1.setAccountName("ncvc");
		
		accounts = new ArrayList<>();
		accounts.add(acc);
		accounts.add(acc1);
		
		transaction1 = new Transaction();
		transaction1.setAccountNumber(ACCOUNT_NUMBER);
		transaction1.setAccountType("Current");
		transaction1.setCreditAmount(200.00);
		transaction1.setCurrency("AUD");
		
		transaction2 = new Transaction();
		transaction2.setAccountNumber(ACCOUNT_NUMBER);
		transaction2.setAccountType("Current");
		transaction2.setCreditAmount(400.00);
		transaction2.setCurrency("AUD");
		
		transactions = new ArrayList<>();
		transactions.add(transaction1);
		transactions.add(transaction2);
			
	}
	/**
	 * Unit test getAllAccounts
	 */
	@Test
	public void getAllAccounts() {
		
		when(bankingService.getAccounts()).thenReturn(accounts);
		List<Account> result = bankingController.getAccounts();
		
		assertTrue(!result.isEmpty());
		assertEquals(accounts, result);
		
	}
	
	/**
	 * Unit test getAllTransactions for a given account
	 */
	@Test
	public void getTransactionsForAccountNumber() {
		when(bankingService.getTransactionsByAccountNos(anyInt())).thenReturn(transactions);
		List<Transaction> result = bankingController.getTransactions(ACCOUNT_NUMBER);
		assertTrue(!result.isEmpty());
		assertEquals(transactions, result);
	}

}

package com.banking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.banking.dto.Transaction;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This integration uses TestRestTemplate
 * 
 * @author Gautham Bhonsle
 *
 */

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class BankingApplicationIntegrationTestTransactions {

	TestRestTemplate restTemplate = new TestRestTemplate();
	
	ObjectMapper mapper = new ObjectMapper();

	String expectedTransactions = "{accountNumber=321143048, accountType=Current, "
			+ "transactionDate=11/03/2021 13:00:00, currency=AUD, "
			+ "creditAmount=30000.5, debitAmount=0.0, transactionType=credit, " + "transactionNarrative=aussie saving}";

	int accountNumber = 321143048;

	String url = "http://localhost:8080/banking/transactions/";

	private Transaction getMockTransaction() {
		Transaction tr = new Transaction();
		tr.setAccountNumber(accountNumber);
		tr.setAccountType("Current");
		tr.setCreditAmount(3000.5);
		return tr;
	}

	@Test
	public void testTransactions() {

		/**
		 * Returns entity object
		 */
		ResponseEntity<List> transaction = restTemplate.getForEntity(url + accountNumber, List.class);
		assertEquals(transaction.getStatusCodeValue(), 200);
		assertTrue(transaction.getBody().toString().contains(expectedTransactions));
		/**
		 * Returns result object
		 */
		/**
		 * Jackson while deserializing sees list.class
		 * List.class returns a hashMap since it does not know the type of class (In this case, DTO- account)
		 *  Hence, it needs to be converter using mapper.convert value
		 *  
		 */
		List<Transaction> transactions = restTemplate.getForObject(url + accountNumber, List.class);
		List<Transaction> accountList = mapper.convertValue(	
				transactions, 
			    new TypeReference<List<Transaction>>(){}
			);
		assertEquals(accountList.get(0).getAccountNumber(), getMockTransaction().getAccountNumber());
	

		
	};

}

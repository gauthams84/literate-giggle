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

	String expectedTransactions = "{accountNumber=321143048, accountType=Current, "
			+ "transactionDate=11/03/2021 13:00:00, currency=AUD, "
			+ "creditAmount=30000.5, debitAmount=0.0, transactionType=credit, " + "transactionNarrative=aussie saving}";

	int accountNumber = 321143048;

	@Test
	public void testTransactions() {
		ResponseEntity<List> transaction = restTemplate
				.getForEntity("http://localhost:8080/banking/transactions/" + accountNumber, List.class);
		assertEquals(transaction.getStatusCodeValue(), 200);
		assertTrue(transaction.getBody().toString().contains(expectedTransactions));
	};

}

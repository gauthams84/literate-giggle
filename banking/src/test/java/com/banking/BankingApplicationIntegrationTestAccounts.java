package com.banking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

/**
 * This Integratoion test makes use of mockMvc
 * 
 * @author Gautham Bhonsle
 *
 */
@SpringBootTest
@AutoConfigureMockMvc
public class BankingApplicationIntegrationTestAccounts {

	@Autowired
	MockMvc mockMvc;

	String expectedAccounts = "{\"accountNumber\":321143048,\"accountName\":"
			+ "\"AUCurrent433\",\"accountType\":\"Current\",\"accountBalance\":38011.0,"
			+ "\"balanceDate\":\"11/03/2021\",\"currency\":\"AUD\"}";

	@Test
	public void testGetAccounts() throws Exception {

		MvcResult mvcResult = mockMvc.perform(get("/banking/accounts"))
				.andExpect(status().isOk()).andReturn();

		assertEquals(mvcResult.getResponse().getContentType(), "application/json");
		assertTrue(mvcResult.getResponse().getContentAsString().contains(expectedAccounts));

	}

}

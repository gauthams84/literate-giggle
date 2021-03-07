package com.banking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.dto.Transaction;

/**
 * Repository for All Transaction related queries
 * 
 * @author Gautham Bhonsle
 *
 */
@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long> {
	/**
	 * Named JPA query method for finding transactions by an account number
	 * 
	 * @param accountNumber
	 * @return List<Transaction>
	 */
	List<Transaction> getTransactionsByAccountNos(int accountNumber);

}

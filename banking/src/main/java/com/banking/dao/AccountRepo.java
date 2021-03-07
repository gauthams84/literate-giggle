package com.banking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.dto.Account;
/**
 * Repository for Account related queries
 * @author Gautham Bhonsle
 *
 */
@Repository
public interface AccountRepo extends JpaRepository<Account, Integer>{

}

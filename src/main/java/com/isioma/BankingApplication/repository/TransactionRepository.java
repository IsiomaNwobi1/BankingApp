package com.isioma.BankingApplication.repository;

import com.isioma.BankingApplication.domain.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {

}

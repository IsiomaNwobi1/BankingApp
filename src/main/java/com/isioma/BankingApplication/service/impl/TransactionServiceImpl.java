package com.isioma.BankingApplication.service.impl;

import com.isioma.BankingApplication.domain.entities.Transaction;
import com.isioma.BankingApplication.payload.request.TransactionRequest;
import com.isioma.BankingApplication.repository.TransactionRepository;
import com.isioma.BankingApplication.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    @Override
    public void saveTransactions(TransactionRequest transactionRequest) {
        Transaction transaction = Transaction.builder()
                .transactionType(transactionRequest.getTransactionType())
                .accountNumber(transactionRequest.getAccountNumber())
                .amount(transactionRequest.getAmount())
                .status("SUCCESS")
                .build();

        transactionRepository.save(transaction);

        System.out.println("Transaction saved successfully");

    }
}

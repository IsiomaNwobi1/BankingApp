package com.isioma.BankingApplication.service;

import com.isioma.BankingApplication.payload.request.TransactionRequest;

public interface TransactionService {

    void saveTransactions(TransactionRequest transactionRequest);
}

package com.isioma.BankingApplication.service;

import com.isioma.BankingApplication.payload.request.CreditAndDebitRequest;
import com.isioma.BankingApplication.payload.request.EnquiryRequest;
import com.isioma.BankingApplication.payload.request.TransferRequest;
import com.isioma.BankingApplication.payload.response.BankResponse;

public interface UserService {

    BankResponse creditAccount(CreditAndDebitRequest request);

    BankResponse debitAccount(CreditAndDebitRequest request);

    BankResponse balanceEnquiry (EnquiryRequest enquiryRequest);

    String nameEnquiry(EnquiryRequest enquiryRequest);

    BankResponse transfer(TransferRequest request);
}

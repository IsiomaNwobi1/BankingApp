package com.isioma.BankingApplication.infrastructure.controller;

import com.isioma.BankingApplication.domain.entities.Transaction;
import com.isioma.BankingApplication.service.impl.BankStatementImpl;
import com.itextpdf.text.DocumentException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/statement")
@RequiredArgsConstructor
public class TransactionController {

    private final BankStatementImpl bankStatement;

    @GetMapping
    public List<Transaction> generateStatement(@RequestParam String accountNumber,
                                               @RequestParam String startDate,
                                               @RequestParam String endDate) throws DocumentException, FileNotFoundException {

        return bankStatement.generateStatement(accountNumber, startDate, endDate);
    }
}

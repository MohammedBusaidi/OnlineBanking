package com.onlineBanking.OnlineBanking.Services;

import com.onlineBanking.OnlineBanking.Models.Transaction;
import com.onlineBanking.OnlineBanking.Repositories.TransactionRepository;
import com.onlineBanking.OnlineBanking.Repositories.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
}

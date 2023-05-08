package com.onlineBanking.OnlineBanking.Services;

import com.onlineBanking.OnlineBanking.Models.Loan;
import com.onlineBanking.OnlineBanking.Repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    @Autowired
    LoanRepository loanRepository;
    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }
}

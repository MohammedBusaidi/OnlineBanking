package com.onlineBanking.OnlineBanking.Services;

import com.onlineBanking.OnlineBanking.Models.Investment;
import com.onlineBanking.OnlineBanking.Repositories.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentService {
    @Autowired
    InvestmentRepository investmentRepository;
    public List<Investment> getAllInvestments() {
        return investmentRepository.findAll();
    }
}

package com.onlineBanking.OnlineBanking.Services;

import com.onlineBanking.OnlineBanking.Models.Statement;
import com.onlineBanking.OnlineBanking.Repositories.StatementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatementService {
    @Autowired
    StatementRepository statementRepository;
    public List<Statement> getAllStatements() {
        return statementRepository.findAll();
    }
}

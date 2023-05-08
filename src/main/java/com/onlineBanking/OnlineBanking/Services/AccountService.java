package com.onlineBanking.OnlineBanking.Services;

import com.onlineBanking.OnlineBanking.Models.Account;
import com.onlineBanking.OnlineBanking.Repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    public List<Account>getAllAccounts() {
        return accountRepository.findAll();
    }
}

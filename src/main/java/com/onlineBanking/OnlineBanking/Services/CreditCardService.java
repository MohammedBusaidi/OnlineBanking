package com.onlineBanking.OnlineBanking.Services;

import com.onlineBanking.OnlineBanking.Models.CreditCard;
import com.onlineBanking.OnlineBanking.Repositories.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardService {
    @Autowired
    CreditCardRepository creditCardRepository;
    public List<CreditCard> getAllCards() {
        return creditCardRepository.findAll();
    }
}

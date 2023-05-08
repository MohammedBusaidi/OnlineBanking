package com.onlineBanking.OnlineBanking.Services;

import com.onlineBanking.OnlineBanking.Models.Transfer;
import com.onlineBanking.OnlineBanking.Repositories.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferService {
    @Autowired
    TransferRepository transferRepository;
    public List<Transfer> getAllTransfers() {
        return transferRepository.findAll();
    }
}

package com.onlineBanking.OnlineBanking.Repositories;

import com.onlineBanking.OnlineBanking.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
}

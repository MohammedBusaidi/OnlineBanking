package com.onlineBanking.OnlineBanking.Repositories;

import com.onlineBanking.OnlineBanking.Models.Investment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestmentRepository extends JpaRepository<Investment,Integer> {
}

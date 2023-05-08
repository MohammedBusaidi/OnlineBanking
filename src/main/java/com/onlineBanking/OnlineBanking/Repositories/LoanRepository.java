package com.onlineBanking.OnlineBanking.Repositories;

import com.onlineBanking.OnlineBanking.Models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan,Integer> {
}

package com.onlineBanking.OnlineBanking.Repositories;

import com.onlineBanking.OnlineBanking.Models.Statement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatementRepository extends JpaRepository<Statement,Integer> {
}

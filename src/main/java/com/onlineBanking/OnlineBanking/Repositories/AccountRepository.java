package com.onlineBanking.OnlineBanking.Repositories;

import com.onlineBanking.OnlineBanking.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {
}

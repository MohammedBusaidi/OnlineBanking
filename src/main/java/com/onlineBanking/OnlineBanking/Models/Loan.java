package com.onlineBanking.OnlineBanking.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Data
@Entity

public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer loanId;
}
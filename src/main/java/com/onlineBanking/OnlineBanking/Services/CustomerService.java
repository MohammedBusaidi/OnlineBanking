package com.onlineBanking.OnlineBanking.Services;

import com.onlineBanking.OnlineBanking.Models.Customer;
import com.onlineBanking.OnlineBanking.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}

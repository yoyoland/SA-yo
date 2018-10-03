
/*
package com.example.demo.controller;
import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import java.util.Collection;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController{
    private CustomerRepository repo;

    public CustomerController(CustomerRepository repo){
        this.repo = repo;
    }
    @GetMapping("/Customer")
    public Collection<Customer> customer(){
        return repo.findAll();
    }
    @GetMapping("/Customer/{Customer_id}")
    public Optional<Customer> takeinByid(@PathVariable Long Customer_id ){
        return repo.findById(Customer_id);
    }
}
*/
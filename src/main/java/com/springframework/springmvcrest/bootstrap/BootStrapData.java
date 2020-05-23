package com.springframework.springmvcrest.bootstrap;

import com.springframework.springmvcrest.domain.Customer;
import com.springframework.springmvcrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("LOading Customer Data");

        Customer c1 = new Customer();
        c1.setFirstName("Alisa");
        c1.setLastName("Dock");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Bob");
        c2.setLastName("Dilan");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("Johns");
        c3.setLastName("Aldo");
        customerRepository.save(c3);

        System.out.println("Customers Saved: " + customerRepository.count());

    }
}

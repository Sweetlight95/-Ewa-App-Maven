package ewa.africa.beansApplication.data.repositories;

import ewa.africa.beansApplication.data.models.Customer;

import java.util.Collection;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    Customer save(Customer aCustomer);

    Optional<Customer> findCustomerByEmail(String email);

    void delete(Customer aCustomer);

    void delete(String email);

    List<Customer> findAll();

    void deleteAll();
}

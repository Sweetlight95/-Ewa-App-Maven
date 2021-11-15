package ewa.africa.beansApplication.data.repositories;

import ewa.africa.beansApplication.data.models.Customer;

import java.util.*;

public class CustomerRepositoryImpl implements CustomerRepository{

    Map<String, Customer> database = new HashMap<>();

    @Override
    public Customer save(Customer aCustomer) {
        database.put(aCustomer.getEmail(), aCustomer);

        return aCustomer;
    }

    @Override
    public Optional<Customer> findCustomerByEmail(String email) {
        if(database.containsKey(email)) return Optional.of(database.get(email));
        return Optional.empty();
    }

    @Override
    public void delete(Customer aCustomer) {
    delete(aCustomer.getEmail());

    }

    @Override
    public void delete(String email) {
        database.remove(email);

    }

    @Override
    public List<Customer> findAll() {
        List<Customer> all = new ArrayList<>();
        Set<String> keysInDB = database.keySet();
        for (String key: keysInDB) {
            all.add(database.get(key));
        }
        return all;
    }

    @Override
    public void deleteAll() {
        database.clear();
    }
}

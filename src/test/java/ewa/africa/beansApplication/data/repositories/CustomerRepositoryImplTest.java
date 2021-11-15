package ewa.africa.beansApplication.data.repositories;

import ewa.africa.beansApplication.data.models.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRepositoryImplTest {
    private CustomerRepository customerRepository;
    @BeforeEach
    void setUp() {
        customerRepository = new CustomerRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void saveNewCustomerTest() {
        Customer customer = new Customer();
        customer.setFirstName("Judith");
        customer.setLastName("Oviawe");
        customer.setEmail("judith@gmail.com");
        customer.setPassword("65794");

        Customer savedCustomer = customerRepository.save(customer);
        assertEquals(customer, savedCustomer);
        assertEquals(1, customerRepository.findAll().size());
    }
    public Customer saveCustomer(){
        Customer customer = new Customer();
        customer.setFirstName("Judith");
        customer.setLastName("Oviawe");
        customer.setEmail("judith@gmail.com");
        customer.setPassword("65794");

        return customerRepository.save(customer);
    }
    @Test
    void findCustomerByEmail() {
        Customer savedCustomer = saveCustomer();
        assertEquals(savedCustomer, customerRepository.
                findCustomerByEmail(saveCustomer().getEmail()).get());
    }

    @Test
    void delete() {
        Customer savedCustomer = saveCustomer();
        customerRepository.delete(savedCustomer.getEmail());
    }

    @Test
    void testFindByEmail() {
    }
}
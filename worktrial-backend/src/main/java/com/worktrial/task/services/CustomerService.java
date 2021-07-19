package com.worktrial.task.services;

import com.worktrial.task.dtos.CustomerDto;
import com.worktrial.task.exceptions.BaseException;
import com.worktrial.task.exceptions.CustomerException;
import com.worktrial.task.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers() throws BaseException;
    List<Customer> searchCustomer(String lastName, String firstName, String emailAddress, String category,
                                  String city, String country, String state) throws BaseException;
    Customer saveCustomer(CustomerDto customerDto);
    Customer findCustomerByCustomerId(String customerId) throws BaseException;
    List<Customer> findCustomerByProductId(String productId) throws BaseException;
    Customer deleteCustomerByCustomerId(String customerId) throws BaseException;
}

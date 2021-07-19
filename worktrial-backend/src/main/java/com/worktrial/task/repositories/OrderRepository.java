package com.worktrial.task.repositories;

import com.worktrial.task.enums.CustomerCategory;
import com.worktrial.task.models.Customer;
import com.worktrial.task.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
    List<Order> findOrderByCustomer(Customer customer);
    @Query("select o from Order o where o.customer.category = :category")
    List<Order> findOrderByCustomerCategory(CustomerCategory category);
}

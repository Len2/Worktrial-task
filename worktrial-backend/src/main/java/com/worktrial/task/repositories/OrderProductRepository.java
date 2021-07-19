package com.worktrial.task.repositories;

import com.worktrial.task.models.OrderProduct;
import com.worktrial.task.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderProductRepository extends JpaRepository<OrderProduct, String> {
    List<OrderProduct> findOrderProductByProduct(Product product);
}

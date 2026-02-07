package com.food.ordering.repository;

import com.food.ordering.entity.Order;
import com.food.ordering.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByCustomer(User customer);
}

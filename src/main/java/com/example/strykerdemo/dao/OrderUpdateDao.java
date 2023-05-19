package com.example.strykerdemo.dao;

import com.example.strykerdemo.entity.OrderUpdates;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderUpdateDao extends JpaRepository<OrderUpdates, Integer> {
}

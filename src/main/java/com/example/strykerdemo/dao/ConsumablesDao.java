package com.example.strykerdemo.dao;

import com.example.strykerdemo.entity.Consumables;
import com.example.strykerdemo.entity.PowerToolset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConsumablesDao extends JpaRepository<Consumables,Integer> {


    @Query(value = "SELECT ct.id AS ct_id, ct.item_name, ct.quantity, ct.serial_no FROM consumables ct " +
            "JOIN ticket_consumable tct ON ct.id = tct.consumables_id JOIN ticket t ON tct.ticket_id = t.id WHERE t.ticket_id = :ticketId", nativeQuery = true)
    List<Consumables> viewConsumableOrder(@Param("ticketId") String ticketId);




}

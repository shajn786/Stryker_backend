package com.example.strykerdemo.dao;

import com.example.strykerdemo.entity.Instruments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InstrumentsDao extends JpaRepository<Instruments, Integer> {

    @Query(value = "SELECT i.id AS i_id, i.item_name, i.quantity, i.serial_no FROM instruments i JOIN ticket_instruments ti ON i.id = ti.instruments_id JOIN ticket t ON ti.ticket_id = t.id WHERE t.ticket_id = :ticketId", nativeQuery = true)
    List<Instruments> viewInstrumentsOrder(@Param("ticketId") String ticketId);
}

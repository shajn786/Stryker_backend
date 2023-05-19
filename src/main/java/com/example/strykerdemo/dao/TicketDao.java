package com.example.strykerdemo.dao;

import com.example.strykerdemo.entity.OrderUpdates;
import com.example.strykerdemo.entity.PowerToolset;
import com.example.strykerdemo.entity.Ticket;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TicketDao extends CrudRepository<Ticket, Integer> {

    @Query(value = "SELECT b.status_level FROM orderupdates b JOIN ticket a ON b.id = a.orderupdates_id WHERE a.ticket_id = :ticketId",nativeQuery = true)
    String viewOrderStatus(@Param("ticketId") String ticketId);


    @Query(value = "SELECT t.ticket_id, t.doctor_name, a.agent_name, a.id AS agent_id FROM ticket t JOIN agent a ON t.agent_id = a.id WHERE t.ticket_id = :ticketId",nativeQuery = true)
    List<Ticket> viewTicket(@Param("ticketId") String ticketId);






}

package com.example.strykerdemo.dao;

import com.example.strykerdemo.entity.Agent;
import com.example.strykerdemo.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AgentDao extends JpaRepository<Agent, Integer> {

    @Query(value = "SELECT u.agent_name FROM agent u INNER JOIN ticket a ON u.id = a.agent_id WHERE a.ticket_id = :ticketId",nativeQuery = true)
    String agentName(@Param("ticketId") String ticketId);



}

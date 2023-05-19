package com.example.strykerdemo.Service;

import com.example.strykerdemo.dto.AgentDto;
import com.example.strykerdemo.dto.TicketDto;
import com.example.strykerdemo.entity.Agent;
import com.example.strykerdemo.entity.Ticket;

import java.util.List;

public interface AgentService {

    String ticketAgent(Ticket t);

    List<AgentDto> viewAgent();



}

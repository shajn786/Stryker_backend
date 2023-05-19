package com.example.strykerdemo.controller;

import com.example.strykerdemo.Service.AgentService;
import com.example.strykerdemo.dto.AgentDto;
import com.example.strykerdemo.entity.Agent;
import com.example.strykerdemo.entity.Consumables;
import com.example.strykerdemo.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgentController {

    @Autowired
    AgentService agentService;

    @CrossOrigin(origins = "*")
    @PostMapping(path ="/ticketagent", consumes = "application/json", produces = "application/json")
    public String viewTicketAgent(@RequestBody Ticket t )
    {
        return agentService.ticketAgent(t);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewAllAgents")
    public List<AgentDto> viewAllAgent()
    {
       return agentService.viewAgent();
    }
}

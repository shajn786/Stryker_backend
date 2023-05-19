package com.example.strykerdemo.controller;


import com.example.strykerdemo.Service.TicketService;
import com.example.strykerdemo.dao.TicketDao;
import com.example.strykerdemo.dto.TicketDto;
import com.example.strykerdemo.entity.OrderUpdates;
import com.example.strykerdemo.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;

    @Autowired
    TicketDao ticketDao;

    @CrossOrigin(origins = "*")
    @GetMapping("/viewallticket")
    public List<TicketDto> homepage()
    {
        return ticketService.viewAllTickets();
    }




    @CrossOrigin(origins = "*")
    @PostMapping(path ="/viewTicket", consumes = "application/json", produces = "application/json")
    List<TicketDto> viewTicket(@RequestBody Ticket t)
    {
           return ticketService.viewTicket(t);
    }



}

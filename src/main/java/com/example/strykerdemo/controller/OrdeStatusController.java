package com.example.strykerdemo.controller;

import com.example.strykerdemo.Service.OrderUpdatesService;
import com.example.strykerdemo.dao.TicketDao;
import com.example.strykerdemo.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdeStatusController {

    @Autowired
    OrderUpdatesService orderUpdatesService;

    @CrossOrigin(origins = "*")
    @PostMapping(path ="/orderstatus", consumes = "application/json", produces = "application/json")
    public String orederStatus(@RequestBody Ticket t)
    {
        return orderUpdatesService.getTicketOrderStatus(t);
    }

}

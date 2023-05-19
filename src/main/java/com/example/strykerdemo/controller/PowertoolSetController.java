package com.example.strykerdemo.controller;


import com.example.strykerdemo.Service.PowerToolSetService;
import com.example.strykerdemo.entity.PowerToolset;
import com.example.strykerdemo.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PowertoolSetController {

    @Autowired
    PowerToolSetService powerToolSetService;

    @CrossOrigin(origins = "*")
    @PostMapping(path ="/viewpowertoolset", consumes = "application/json", produces = "application/json")
    public List<PowerToolset> viewPowerToolOrder(@RequestBody Ticket t )
    {
        System.out.println(t.getTicket_id());
        return  powerToolSetService.viewPowertoolSetOrder(t);
    }
}

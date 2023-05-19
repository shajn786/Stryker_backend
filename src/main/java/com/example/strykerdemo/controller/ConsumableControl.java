package com.example.strykerdemo.controller;


import com.example.strykerdemo.Service.ConsumablesService;
import com.example.strykerdemo.dao.ConsumablesDao;
import com.example.strykerdemo.entity.Consumables;
import com.example.strykerdemo.entity.PowerToolset;
import com.example.strykerdemo.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumableControl {


    @Autowired
    ConsumablesService consumablesService;



    @CrossOrigin(origins = "*")
    @PostMapping(path ="/viewconsumableorder", consumes = "application/json", produces = "application/json")
    public List<Consumables> viewPowerToolOrder(@RequestBody Ticket t )
    {
      return consumablesService.viewConsumableOrder(t);
    }


}

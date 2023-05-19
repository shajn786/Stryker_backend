package com.example.strykerdemo.controller;


import com.example.strykerdemo.Service.InstrumentsService;
import com.example.strykerdemo.dao.InstrumentsDao;
import com.example.strykerdemo.entity.Consumables;
import com.example.strykerdemo.entity.Instruments;
import com.example.strykerdemo.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InstrumentsController {

    @Autowired
    InstrumentsService instrumentsService;

    @CrossOrigin(origins = "*")
    @PostMapping(path ="/viewinstrumentsorder", consumes = "application/json", produces = "application/json")
    public List<Instruments> viewInstrumentsOrder(@RequestBody Ticket t )
    {

        return  instrumentsService.viewInstrumentsOrder(t);
    }
}

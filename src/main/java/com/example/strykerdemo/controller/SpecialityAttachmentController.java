package com.example.strykerdemo.controller;


import com.example.strykerdemo.Service.SpecialityAttachmentsService;
import com.example.strykerdemo.dao.ConsumablesDao;
import com.example.strykerdemo.dao.SpecialityAttachmentsDao;
import com.example.strykerdemo.entity.Consumables;
import com.example.strykerdemo.entity.SpecialityAttachments;
import com.example.strykerdemo.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpecialityAttachmentController {


    @Autowired
    SpecialityAttachmentsService specialityAttachmentsService;




    @CrossOrigin(origins = "*")
    @PostMapping(path ="/viewspecialityattachmentsorder", consumes = "application/json", produces = "application/json")
    public List<SpecialityAttachments> viewSpecialityAttachment(@RequestBody Ticket t )
    {
        System.out.println(t.getTicket_id());
        return  specialityAttachmentsService.viewSpecialityAttachmentOrder(t);
    }
}

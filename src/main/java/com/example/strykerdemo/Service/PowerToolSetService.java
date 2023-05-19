package com.example.strykerdemo.Service;

import com.example.strykerdemo.entity.PowerToolset;
import com.example.strykerdemo.entity.Ticket;

import java.util.List;

public interface PowerToolSetService {

    List<PowerToolset> viewPowertoolSetOrder(Ticket t);
}

package com.example.strykerdemo.Service;

import com.example.strykerdemo.entity.Consumables;
import com.example.strykerdemo.entity.Ticket;

import java.util.List;

public interface ConsumablesService {



    List<Consumables> viewConsumableOrder(Ticket t);

}

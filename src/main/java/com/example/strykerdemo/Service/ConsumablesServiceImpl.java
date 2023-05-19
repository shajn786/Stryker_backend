package com.example.strykerdemo.Service;

import com.example.strykerdemo.dao.ConsumablesDao;
import com.example.strykerdemo.entity.Consumables;
import com.example.strykerdemo.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumablesServiceImpl implements  ConsumablesService{

    @Autowired
    ConsumablesDao consumablesDao;

    @Override
    public List<Consumables> viewConsumableOrder(Ticket t) {
        System.out.println(t.getTicket_id());
       return consumablesDao.viewConsumableOrder(t.getTicket_id());
    }
}

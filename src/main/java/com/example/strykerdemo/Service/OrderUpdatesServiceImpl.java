package com.example.strykerdemo.Service;

import com.example.strykerdemo.dao.OrderUpdateDao;
import com.example.strykerdemo.dao.TicketDao;
import com.example.strykerdemo.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderUpdatesServiceImpl implements  OrderUpdatesService{

  @Autowired
    TicketDao ticketDao;

    @Override
    public String getTicketOrderStatus(Ticket t) {

     return  ticketDao.viewOrderStatus(t.getTicket_id());
    }
}

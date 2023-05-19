package com.example.strykerdemo.Service;


import com.example.strykerdemo.dto.TicketDto;
import com.example.strykerdemo.entity.Ticket;

import java.util.List;

public interface TicketService {

    List<TicketDto>  viewAllTickets();

    List<TicketDto> viewTicket(Ticket t);





}

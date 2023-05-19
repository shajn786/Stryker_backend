package com.example.strykerdemo.Service;


import com.example.strykerdemo.dao.TicketDao;
import com.example.strykerdemo.dto.TicketDto;
import com.example.strykerdemo.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


@Service
public class TicketServiceImpl implements  TicketService{

    @Autowired
    TicketDao ticketDao;


    @Override
    public List<TicketDto> viewAllTickets() {

        List<TicketDto> ticketList = new ArrayList<>();
        List<Ticket> tickets = (List<Ticket>) ticketDao.findAll();


        for (Ticket ticket : tickets) {
            TicketDto ticketDto = convertToDo(ticket);
            ticketList.add(ticketDto);
        }
        return ticketList;
    }

    @Override
    public List<TicketDto> viewTicket(Ticket t) {

        List<TicketDto> tickett = new ArrayList<>();
        System.out.println(t.getTicket_id());
       Ticket tickets =   ticketDao.findById(t.getId()).orElseThrow(() -> new NoSuchElementException("Ticket not found with ID: "+t.getTicket_id() ));



            TicketDto ticketDto = convertToDo(tickets);
            tickett.add(ticketDto);

        return tickett;

    }




    public TicketDto convertToDo(Ticket t) {
        TicketDto ticketDto = new TicketDto();
        ticketDto.setTicket_id(t.getTicket_id());
        ticketDto.setDoctorName(t.getDoctorName());
        ticketDto.setSurgeryName(t.getSurgeryName());
        ticketDto.setTicketDate(t.getTicketDate());
        ticketDto.setHospitalName(t.getHospitalName());
        ticketDto.setItemCount(t.getItemCount());
        ticketDto.setStatus(t.getStatus());
        ticketDto.setPriority(t.getPriority());
        ticketDto.setTime(t.getTime());
        ticketDto.setAgentName(t.getAgent().getAgentName());




        return ticketDto;
    }
}

package com.example.strykerdemo.Service;

import com.example.strykerdemo.dao.AgentDao;
import com.example.strykerdemo.dto.AgentDto;
import com.example.strykerdemo.dto.TicketDto;
import com.example.strykerdemo.entity.Agent;
import com.example.strykerdemo.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AgentServiceImpl implements AgentService{

   @Autowired
    AgentDao agentDao;

    @Override
    public String ticketAgent(Ticket t) {
       return agentDao.agentName(t.getTicket_id());
    }

    @Override
    public List<AgentDto> viewAgent() {
        List<AgentDto> agentList = new ArrayList<>();
        List<Agent> agents = (List<Agent>) agentDao.findAll();


        for (Agent agent : agents) {
            AgentDto ticketDto = convertToDo(agent);
            agentList.add(ticketDto);
        }
        return agentList;
    }


    public AgentDto convertToDo(Agent a) {
        AgentDto ticketDto = new AgentDto();
        ticketDto.setAgentName(a.getAgentName());
        ticketDto.setDistance(a.getDistance());
        ticketDto.setLocation(a.getLocation());

        return ticketDto;
    }


}

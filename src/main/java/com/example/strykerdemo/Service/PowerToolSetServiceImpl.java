package com.example.strykerdemo.Service;

import com.example.strykerdemo.dao.PowertoolsetDao;
import com.example.strykerdemo.entity.PowerToolset;
import com.example.strykerdemo.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerToolSetServiceImpl implements  PowerToolSetService{

    @Autowired
    PowertoolsetDao powertoolsetDao;

    @Override
    public List<PowerToolset> viewPowertoolSetOrder(Ticket t) {
        return powertoolsetDao.viewPowerToolOrder(t.getTicket_id());
    }
}

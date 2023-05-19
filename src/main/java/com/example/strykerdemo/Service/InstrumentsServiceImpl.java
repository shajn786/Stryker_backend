package com.example.strykerdemo.Service;

import com.example.strykerdemo.dao.InstrumentsDao;
import com.example.strykerdemo.entity.Instruments;
import com.example.strykerdemo.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrumentsServiceImpl implements  InstrumentsService{

    @Autowired
    InstrumentsDao instrumentsDao;

    @Override
    public List<Instruments> viewInstrumentsOrder(Ticket t) {
       return instrumentsDao.viewInstrumentsOrder(t.getTicket_id());
    }
}

package com.example.strykerdemo.Service;

import com.example.strykerdemo.entity.Instruments;
import com.example.strykerdemo.entity.Ticket;

import java.util.List;

public interface InstrumentsService {

    List<Instruments> viewInstrumentsOrder(Ticket t);
}

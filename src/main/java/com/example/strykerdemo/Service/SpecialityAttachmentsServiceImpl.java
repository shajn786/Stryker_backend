package com.example.strykerdemo.Service;

import com.example.strykerdemo.dao.SpecialityAttachmentsDao;
import com.example.strykerdemo.entity.SpecialityAttachments;
import com.example.strykerdemo.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialityAttachmentsServiceImpl implements  SpecialityAttachmentsService{

    @Autowired
    SpecialityAttachmentsDao specialityAttachmentsDao;

    @Override
    public List<SpecialityAttachments> viewSpecialityAttachmentOrder(Ticket t) {
        return specialityAttachmentsDao.viewSpecialityAttachmentOrder(t.getTicket_id());
    }
}

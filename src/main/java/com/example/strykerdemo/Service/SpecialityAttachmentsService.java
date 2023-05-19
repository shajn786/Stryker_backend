package com.example.strykerdemo.Service;

import com.example.strykerdemo.entity.SpecialityAttachments;
import com.example.strykerdemo.entity.Ticket;

import java.util.List;

public interface SpecialityAttachmentsService {

    List<SpecialityAttachments> viewSpecialityAttachmentOrder(Ticket t);
}

package com.example.strykerdemo.dao;

import com.example.strykerdemo.entity.Consumables;
import com.example.strykerdemo.entity.SpecialityAttachments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SpecialityAttachmentsDao extends JpaRepository<SpecialityAttachments,Integer> {


    @Query(value = "    SELECT sa.id AS sa_id, sa.item_name, sa.quantity, sa.serial_no FROM speciityattachments sa JOIN ticket_specialityattachments tsa ON sa.id = tsa.specialityattachmnets_id JOIN ticket t ON tsa.ticket_id = t.id WHERE t.ticket_id = :ticketId",nativeQuery = true)
    List<SpecialityAttachments>viewSpecialityAttachmentOrder(@Param("ticketId") String ticketId );




}

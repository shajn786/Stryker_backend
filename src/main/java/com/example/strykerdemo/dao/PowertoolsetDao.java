package com.example.strykerdemo.dao;

import com.example.strykerdemo.entity.PowerToolset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PowertoolsetDao extends JpaRepository<PowerToolset,Integer> {

    @Query(value = "SELECT pt.id AS pt_id, pt.item_name, pt.quantity, pt.serial_no FROM powertoolset pt JOIN ticket_powertoolset tpt ON pt.id = tpt.powertoolset_id JOIN ticket t ON tpt.ticket_id = t.id WHERE t.ticket_id = :ticketId", nativeQuery = true)
    List<PowerToolset> viewPowerToolOrder(@Param("ticketId") String ticketId);


}

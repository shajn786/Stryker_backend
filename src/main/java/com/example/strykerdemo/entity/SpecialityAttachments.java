package com.example.strykerdemo.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "speciityattachments")
public class SpecialityAttachments {

    @Id
    @GeneratedValue
    @Column(name = "sa_id")
    private int id;
    @Column(name = "serial_no")
    private String serialNo;
    @Column(name = "item_name")
    private String itemName;
    private int quantity;

    @JsonBackReference
    @ManyToMany(mappedBy = "specialityattachments")
    private Set<Ticket> tickets = new HashSet<>();

    public SpecialityAttachments() {
    }

    public SpecialityAttachments(int id, String serialNo, String itemName, int quantity, Set<Ticket> tickets) {
        this.id = id;
        this.serialNo = serialNo;
        this.itemName = itemName;
        this.quantity = quantity;
        this.tickets = tickets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }
}

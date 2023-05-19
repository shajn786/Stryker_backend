package com.example.strykerdemo.entity;


import jakarta.persistence.*;


import java.util.List;

@Entity
@Table(name="orderupdates")
public class OrderUpdates {


    @Id
    @GeneratedValue
    private int id;

    private String statusLevel;

    @OneToMany(mappedBy = "orderupdates", cascade = CascadeType.ALL)
    private List<Ticket> tickets;

    public OrderUpdates() {
    }

    public OrderUpdates(int id, String statusLevel, List<Ticket> tickets) {
        this.id = id;
        this.statusLevel = statusLevel;
        this.tickets = tickets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatusLevel() {
        return statusLevel;
    }

    public void setStatusLevel(String statusLevel) {
        this.statusLevel = statusLevel;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}

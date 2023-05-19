package com.example.strykerdemo.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "agent")
public class Agent {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "agent_name")
    private String agentName;
    private String location;
    private double distance;

    @OneToOne(mappedBy = "agent")
    private  Ticket ticket;

    public Agent() {
    }

    public Agent(int id, String agentName, String location, double distance, Ticket ticket) {
        this.id = id;
        this.agentName = agentName;
        this.location = location;
        this.distance = distance;
        this.ticket = ticket;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}

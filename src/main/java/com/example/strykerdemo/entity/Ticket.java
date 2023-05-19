package com.example.strykerdemo.entity;


import jakarta.persistence.*;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue
    private int id;
    private String surgeryName;
    private String ticket_id;
    private String doctorName;
    private String time;
    private Date ticketDate;
    private  String hospitalName;
    private int itemCount;
    private String status;
    private String priority;


    @OneToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;



    @ManyToMany
    @JoinTable(name = "ticket_powertoolset", joinColumns = @JoinColumn(name = "ticket_id"),
            inverseJoinColumns = @JoinColumn(name = "powertoolset_id"))
    private Set<PowerToolset> powertoolset = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "ticket_consumable", joinColumns = @JoinColumn(name = "ticket_id"),
            inverseJoinColumns = @JoinColumn(name = "consumables_id"))
    private Set<Consumables> consumables = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "ticket_specialityattachments", joinColumns = @JoinColumn(name = "ticket_id"),
            inverseJoinColumns = @JoinColumn(name = "specialityattachmnets_id"))
    private Set<Consumables> specialityattachments = new HashSet<>();


    @ManyToMany
    @JoinTable(name = "ticket_instruments", joinColumns = @JoinColumn(name = "ticket_id"),
            inverseJoinColumns = @JoinColumn(name = "instruments_id"))
    private Set<Instruments> instruments = new HashSet<>();


    @ManyToOne
    @JoinColumn(name = "orderupdates_id")
    private OrderUpdates orderupdates;

    public Ticket() {
    }

    public Ticket(int id, String surgeryName, String ticket_id, String doctorName, String time, Date ticketDate, String hospitalName, int itemCount, String status, String priority, Agent agent, Set<PowerToolset> powertoolset, Set<Consumables> consumables, Set<Consumables> specialityattachments, Set<Instruments> instruments, OrderUpdates orderupdates) {
        this.id = id;
        this.surgeryName = surgeryName;
        this.ticket_id = ticket_id;
        this.doctorName = doctorName;
        this.time = time;
        this.ticketDate = ticketDate;
        this.hospitalName = hospitalName;
        this.itemCount = itemCount;
        this.status = status;
        this.priority = priority;
        this.agent = agent;
        this.powertoolset = powertoolset;
        this.consumables = consumables;
        this.specialityattachments = specialityattachments;
        this.instruments = instruments;
        this.orderupdates = orderupdates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurgeryName() {
        return surgeryName;
    }

    public void setSurgeryName(String surgeryName) {
        this.surgeryName = surgeryName;
    }

    public String getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(String ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(Date ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Set<PowerToolset> getPowertoolset() {
        return powertoolset;
    }

    public void setPowertoolset(Set<PowerToolset> powertoolset) {
        this.powertoolset = powertoolset;
    }

    public Set<Consumables> getConsumables() {
        return consumables;
    }

    public void setConsumables(Set<Consumables> consumables) {
        this.consumables = consumables;
    }

    public Set<Consumables> getSpecialityattachments() {
        return specialityattachments;
    }

    public void setSpecialityattachments(Set<Consumables> specialityattachments) {
        this.specialityattachments = specialityattachments;
    }

    public Set<Instruments> getInstruments() {
        return instruments;
    }

    public void setInstruments(Set<Instruments> instruments) {
        this.instruments = instruments;
    }

    public OrderUpdates getOrderupdates() {
        return orderupdates;
    }

    public void setOrderupdates(OrderUpdates orderupdates) {
        this.orderupdates = orderupdates;
    }
}


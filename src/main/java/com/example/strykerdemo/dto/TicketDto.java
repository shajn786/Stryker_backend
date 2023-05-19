package com.example.strykerdemo.dto;

import java.util.Date;

public class TicketDto {


    private String surgeryName;
    private String ticket_id;
    private String doctorName;
    private String time;
    private Date ticketDate;
    private  String hospitalName;
    private int itemCount;
    private String status;
    private String priority;
    private String agentName;

    public TicketDto() {
    }

    public TicketDto(String surgeryName, String ticket_id, String doctorName, String time, Date ticketDate, String hospitalName, int itemCount, String status, String priority, String agentName) {
        this.surgeryName = surgeryName;
        this.ticket_id = ticket_id;
        this.doctorName = doctorName;
        this.time = time;
        this.ticketDate = ticketDate;
        this.hospitalName = hospitalName;
        this.itemCount = itemCount;
        this.status = status;
        this.priority = priority;
        this.agentName = agentName;
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

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }
}

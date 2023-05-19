package com.example.strykerdemo.dto;

public class AgentDto {

    private String agentName;
    private Double distance;
    private String location;

    public AgentDto() {
    }

    public AgentDto(String agentName, Double distance, String location) {
        this.agentName = agentName;
        this.distance = distance;
        this.location = location;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

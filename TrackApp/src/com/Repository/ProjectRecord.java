package com.Repository;

public class ProjectRecord {
    String id;
    String title;
    String clientId;
    int duration;
    int rate;
    int numberOfAllocatedResources;
    String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getNumberOfAllocatedResources() {
        return numberOfAllocatedResources;
    }

    public void setNumberOfAllocatedResources(int numberOfAllocatedResources) {
        this.numberOfAllocatedResources = numberOfAllocatedResources;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

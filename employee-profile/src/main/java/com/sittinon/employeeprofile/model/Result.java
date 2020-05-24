package com.sittinon.employeeprofile.model;

public class Result {
    private String status;
    private String description;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status='" + status + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

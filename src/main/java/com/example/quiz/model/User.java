package com.example.quiz.model;

public class User {
    private Integer numberOfPoints;

    public User() {
        numberOfPoints=0;
    }

    public void addPoint() {
        numberOfPoints++;
    }

    public Integer getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(Integer numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }
}
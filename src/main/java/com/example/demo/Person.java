package com.example.demo;

public class Person {

    private final static double MOVEMENT = 1;

    private String firstName;
    private String lastName;
    private double leftPosition;
    private double rightPosition;
    private double forwardPosition;
    private double backwardPosition;

    public double getForwardPosition() {
        return forwardPosition;
    }

    public void setForwardPosition(double forwardPosition) {
        this.forwardPosition = forwardPosition;
    }

    public double getBackwardPosition() {
        return backwardPosition;
    }

    public void setBackwardPosition(double backwardPosition) {
        this.backwardPosition = backwardPosition;
    }

    public double getLeftPosition() {
        return leftPosition;
    }

    public void setLeftPosition(int leftPosition) {
        this.leftPosition = leftPosition;
    }

    public double getRightPosition() {
        return rightPosition;
    }

    public void setRightPosition(int rightPosition) {
        this.rightPosition = rightPosition;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        rightPosition = 0;
        leftPosition = 0;
        backwardPosition = 0;
        forwardPosition = 0;
    }

    public Person()    {
        rightPosition = 0;
        leftPosition = 0;
        backwardPosition = 0;
        forwardPosition = 0;
    }

    public String running(){
        String s1 = firstName + " " + lastName + " running forward.";
        forwardPosition =+ MOVEMENT + MOVEMENT;
        return s1;
    }

    public String goingInCircles(){
        String s1 = firstName + " " + lastName + " stepped left.";
        leftPosition = leftPosition + MOVEMENT;
        s1 = s1 + '\n' + firstName + " " + lastName + " stepped right.";
        rightPosition = rightPosition + MOVEMENT;
        s1 = s1 + '\n' + firstName + " " + lastName + " stepped forward.";
        forwardPosition = forwardPosition + MOVEMENT;
        s1 = s1 + '\n' + firstName + " " + lastName + " stepped backed.";
        backwardPosition = backwardPosition + MOVEMENT;
        return s1;
    }
}

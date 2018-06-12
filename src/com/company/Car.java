package com.company;

public class Car extends Vehicle {
    private String name;
    private String color;
    private int speed;
    Car(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("The speed is " + speed + " mph");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Car(String name, String color, int speed){
        this.name = name;
        this.color = color;
        this.speed = speed;
    }
    public String accelerate(){
        return "is accelerating";
    }
    public String start(){
        return "is starting";
    }
    public String going(){
        return "is going " + getSpeed() + "mph";
    }
    public String stop(){
        return "is stopped";
    }
}

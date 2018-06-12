package com.company;


public class CarApp {
    public static void main(String[] args){
        Car car = new Car("Porsche", "red", 50);
        Car car2 = new Car("Jetta", "blue", 50);

            System.out.println("The " + car2.getColor() + car.getName() + car.going());
            System.out.println("The " + car.getColor() + car.getName() + car.start());
            System.out.println("The " + car2.getColor() + car.getName() + car.accelerate());
            System.out.println("The " + car.getColor() + car.getName() + car.accelerate());
            System.out.println("The " + car.getColor() + car.getName() + car.going());
            System.out.println("The " + car2.getColor() + car.getName() + car.stop());
            System.out.println("The " + car.getColor() + car.getName() + car.stop());
            System.out.println("The " + car2.getColor() + car.getName() + car.start());



    }
}

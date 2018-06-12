package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int a, b, result = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");

        a = input.nextInt();
        b = input.nextInt();
        try {
            result = a / b;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic error");
        }catch(Exception e){
            System.out.println("General error ");
        }
        finally {
            System.out.println("finally block will execute.");
        }
        System.out.println("Result = " + result);
    }
}
package com.salat;

import java.util.Scanner;

public class SalatProducts {
    Scanner scanner = new Scanner(System.in);
    String name;
    double mass;
    double calorie;

    SalatProducts(String name, double calorie_or){
        this.name = name;
        System.out.print("\nEnter the weight of the " + name + ": ");
        double ms = scanner.nextFloat();
        mass = ms;
        calorie = calorie_or*(ms*10);
    }

    String getName(){
        return name;
    }

    double getMass(){
        return mass;
    }

    double getCalorie(){
        return calorie;
    }

    public String toString(){
        return String.format("\t\t-%s (%.3fkg, %.1fkcal)\n",name, mass, calorie);
    }

}

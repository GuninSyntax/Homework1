package org.example.task3;

import java.util.Scanner;

/*
Создать метод который будет считать площадь круга c произвольным радиусом
 */


public class Task3 {
    public static void main(String[] args) {
        int radius = 7;
        System.out.println("Радиус равен: " + radius);
        double result = calculateArea(radius);
        System.out.println("Площадь круга равна: " + result);
    }

    //Можно сделать без класса Math, а формулой (PI * radius в степени 2)
    private static double calculateArea(int radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}

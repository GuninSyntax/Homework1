package org.example.task2;

import java.util.Scanner;

/*
Создать метод который будет считать площадь квадрата
с произвольными (установленными вами) сторонами
 */

public class Task2 {

    public static void main(String[] args) {
        int side = 5;
        System.out.println("Сторона квадрата равна: " + side);
        double result = calculateArea(side);
        System.out.println("Площадь квадрата равна: " + result);


    }

    //Можно сделать без класса Math, а формулой (сторона в степени 2)
    private static double calculateArea(int side) {
        double area = Math.pow(side, 2);
        return area;
    }

}

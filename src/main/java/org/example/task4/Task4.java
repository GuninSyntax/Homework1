package org.example.task4;

/*
Создать метод который будет считать площадь
треугольника произвольными (установленными вами) сторонами"
 */

public class Task4 {
    public static void main(String[] args) {
        //стороны треугольника
        int a = 4, b = 5, c = 3;
        System.out.println("Стороны треугольника: a = " + a + " b = " + b + " c = " + 17);
        //поиск полупериметра
        double p = (a + b + c + .0) / 2 ;
        //вычисление площади
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь треугольника равна: " + area);
    }
}

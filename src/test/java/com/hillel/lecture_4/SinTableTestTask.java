package com.hillel.lecture_4;

/**
 * Написать программу, которая печатает табличку значений sin(x), где x это каждые 10 градусов от 0 до 360
 */
public class SinTableTestTask {
    public static void main(String[] args) {
        for (int i=10; i<= 360; i=i+10) {
            System.out.println("Sin("+i+"): " + Math.sin(i));
        }
    }

}

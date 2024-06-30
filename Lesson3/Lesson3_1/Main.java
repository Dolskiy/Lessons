package Lessons.Lesson3.Lesson3_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("\t\t\t\t\t***Программа запущена***");
        System.out.println("Данная программа переводит температуру из градусов Цельсия в температуру по Фаренгейту.\n");
        System.out.println("Введите темпретару в градусах Цельсиия ниже с помощью клавиатуры.");
        double temperature_C = new Scanner(System.in).nextDouble();
        System.out.println("Вы ввели тепературу: " + temperature_C + " C.");
        double temperaute_F = temperature_C * 1.8 + 32;
        System.out.println("Температура по Фаренгейту равна: " + temperaute_F + " F.");
    }
}

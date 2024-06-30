package Lessons.Lesson3.Lesson3_2;

/*
    Написать конвертер валют. Пользователь вводит рубли, а программа печатает значение в долларах и евро. Взять актуальный курс валют.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double USD = 85.66;
        double EUR = 91.79;

        System.out.println("\t\t\t\t***Программа запущена***");
        System.out.println("Введите сумму в рублях, которую необходимо конвертировать.");

        double sumRubles = new Scanner(System.in).nextDouble();

        System.out.println("Введённая Вами сумма:" + sumRubles + " р.");
        System.out.println("Введите число, соответствующее тому, во что Вы хотите конвертировать рубли, где:");
        System.out.println("1 - USD;");
        System.out.println("2 - EUR;");
        System.out.println("3 - USD & EUR.");

        byte selectNumber = new Scanner(System.in).nextByte();

        double convertToUSD = sumRubles / USD;
        double convertToEUR = sumRubles / EUR;

        if (selectNumber == 1){
            System.out.println("В долларах Ваша сумма составит: " +convertToUSD);
        } else if (selectNumber == 2) {
            System.out.println("В евро Ваша сумма составит: " +convertToEUR);
        } else if (selectNumber == 3) {
            System.out.println("В долларах Ваша сумма составит: " +convertToUSD);
            System.out.println("В евро Ваша сумма составит: " +convertToEUR);
        } else {
            System.out.println("Вы ввели число, которое не предусмотрено в списке. Необходим перезапуск программы.");
        }
    }
}

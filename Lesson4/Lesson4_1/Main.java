package Lessons.Lesson4.Lesson4_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    Задание:  Написать калькулятор, чтобы он мог считать сумму, разность, произведение и частное двух чисел, которые вводит пользователь.
    Сделать так, чтобы калькулятор мог работать как с целыми числами, так и с дробными.
     */
        System.out.println("\t\t\t***Калькулятор запущен***");

        // Ввод чисел пользователем
        System.out.println("Введите первое число:");
        double firstNumber = new Scanner(System.in).nextDouble();
        System.out.println("Введите второе число:");
        double secondNumber = new Scanner(System.in).nextDouble();

        // Описание доступных действий
        System.out.println("Числа приняты, введите число, соответствующее необходимому действию, где:");
        System.out.println("1 - Сложение;");
        double sum = firstNumber + secondNumber;
        System.out.println("2 - Вычитание;");
        double subtract = firstNumber - secondNumber;
        System.out.println("3 - Умножение;");
        double multiply = firstNumber * secondNumber;
        System.out.println("4 - Деление.");
        double divide = firstNumber / secondNumber;

        // Выбор необходимого действия
        byte choiceNumber = new Scanner(System.in).nextByte();
        if (choiceNumber ==1){
            System.out.println("Сумма чисел равна: " + sum);
        } else if (choiceNumber == 2){
            System.out.println("Разность чисел равна: " + subtract);
        } else if (choiceNumber == 3) {
            System.out.println("Произведение чисел равно: " +multiply);
        } else if (choiceNumber == 4) {
            System.out.println("Частное чисел равно: " +divide);
        } else {
            System.out.println("Введёное число отсутствует в списке доступных операций. Требуется перезапуск программы.");
        }
    }
}

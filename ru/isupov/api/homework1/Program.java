package ru.isupov.api.homework1;

import java.util.Scanner;

public class Program{

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws java.io.IOException {
        boolean f = true;
        while(f){
            System.out.println("Здравствуйте, пользователь! \n Укажите номер задачи:");
            System.out.println("1 - Задача 1: Вычислить n-ое треугольного число");
            System.out.println("2 - Задача 2: Вывести все простые числа от 1 до 1000");
            System.out.println("3 - Задача 3: Реализовать простой калькулятор");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());
    
            switch(no){

                case 1:
                    Triangle.run();
                    break;
                
                case 2:
                    TOutputOfNumbers.run();
                    break;
                        
                case 3:
                    Calculator.run();
                    break;

                case 0:
                    System.out.println("Завершение работы приложения.");
                    f = false;
                    break;
                default:
                    System.out.println("Некорректный номер задачи,\nповторите попытку ввода.");
                    System.out.println();
                    break;
            }
        }
    }
}
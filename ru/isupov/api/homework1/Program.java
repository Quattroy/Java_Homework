package ru.isupov.api.homework1;

import java.util.Scanner;

public class Program{

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
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
                    Triangle();
                    break;
                }}}}
//                 case 1:
//                     printName();
//                     break;
//                 case 3:
//                     task3("Добро пожаловать на курс по Java");
//                     break;
//                 case 0:
//                     System.out.println("Завершение работы приложения.");
//                     f = false;
//                     break;
//                 default:
//                     System.out.println("Некорректный номер задачи,\nповторите попытку ввода.");
//                     break;
//             }
//         }
//     }

//     /*
//      * Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
//      */
//     static void task3(String str){

//         for (int i = 0, j = 10; i < j; i++, j--){
//             System.out.printf("i=%d - j=%d\n", i, j);
//         }

//         String[] words = str.split(" ");
//         for (int i = words.length - 1; i >= 0; i--){
//             System.out.printf("%s ", words[i]);
//         }
//         System.out.println();
//     }


//     /*
//      * Написать программу, которая запросит пользователя ввести <Имя> в консоли.
//      * Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
//      */

//     static void printName(){
//         int i = 12;
//         double j = 12.4;
//         System.out.print("Введите ваше имя: ");
//         String name = scanner.nextLine();
//         System.out.println("Привет, " + name + "!");
//         System.out.printf("Привет, %s ! %d  %.2f\n", name, i, j);
//     }

//     /*
//      * Дан массив двоичных чисел, например [1,1,0,1,1,1,0,1], вывести
//      * максимальное количество подряд идущих 1.
//      */
//     static void task2(){

//         int counter = 0;
//         int max = 0;

//         int[] array = new int[5];
//         array[0] = 1;
//         array[1] = 1;
//         array[2] = 0;
//         array[3] = 1;
//         array[4] = 0;
//         int[] array1 = {1, 0, 0, 1, 1, 1, 0, 1};
//         for (int e : array1) {
//             if (e == 1)
//                 counter++;
//             else{
//                 if (counter > max)
//                     max  = counter;
//                 counter = 0;
//             }
//         }

//         System.out.printf("Максимальное кол-во подряд идущих единиц: %d\n", max);
//     }


// }

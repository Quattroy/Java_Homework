package ru.isupov.api.homework1;
import java.util.Scanner;


public class Calculator {
    static Scanner sc = new Scanner(System.in);

    public static void run() throws java.io.IOException {
        System.out.println("Введите первое число: ");
        double a = Double.parseDouble(sc.nextLine());

        System.out.println("Введите второе число: ");
        double b = Double.parseDouble(sc.nextLine());

        System.out.println("Введите тип операции: +, -, /, *: ");
        char operation = sc.nextLine().charAt(0);

        if(operation == '+') {
            System.out.printf("%f + %f = %f\n", a, b, addition(a,b));
        }

        else if(operation == '-') {
            System.out.printf("%f - %f = %f\n", a, b, subtraction(a,b));
        }

        else if(operation == '/') {
            System.out.printf("%f / %f = %f\n", a, b, division(a,b));
        }

        else if(operation == '*') {
            System.out.printf("%f * %f = %f\n", a, b, multiplication(a,b));
        }

        else{
            System.out.println("Вы ввели некорректный тип операции!");
        }
        System.out.println();
    }



    public static double addition(double a, double b) {
        double res = a + b;
        return res;
    }

    public static double subtraction(double a, double b){
        double res = a - b;
        return res;
    }

    public static double division(double a, double b){
        double res = a / b;
        return res;
    }

    public static double multiplication(double a, double b){
        double res = a * b;
        return res;
    }
}
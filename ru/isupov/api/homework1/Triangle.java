package ru.isupov.api.homework1;
import java.util.Scanner;

class Triangle {
    static Scanner sc = new Scanner(System.in);
    public static void run (){  

        System.out.println("Введите число n:  ");
        double n = Double.parseDouble(sc.nextLine());
        double res = result(n);
        System.out.printf("n-ое треугольного число:  %g\n", res);
        double proizv = proizvedenie(n);
        System.out.printf("произведение чисел от 1 до n:  %g\n", proizv);
        System.out.println();
        
    }

    public static double result(double n) {
       
        if(n==1)          
            return 1;
        else
            return(n + result(n-1));
    }

    public static double proizvedenie(double n) {
        double res = 1;
        for (double i = 1; i <= n; i++) {
            res = res * i;
            }
            return res;
    }
}
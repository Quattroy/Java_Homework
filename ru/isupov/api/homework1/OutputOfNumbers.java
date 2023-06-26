package ru.isupov.api.homework1;
import java.util.Scanner;

// 2) Вывести все простые числа от 1 до 1000


class TOutputOfNumbers {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        for (int j = 2; j <= 100; j++) {
            boolean simple = false;

            for (int i = 2; i * i <= j; i++) {
                simple = (j % i == 0);
                if (simple) {
                    break;
                }
            }
            if (!simple) {
                System.out.print(j + " ");
            }
        }
    }
}
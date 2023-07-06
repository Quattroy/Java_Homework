// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package ru.isupov.api.homework4;

import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> newList = linList();
        System.out.println("Перевернутый список: " + reverseList(newList));
    }


    static LinkedList<String> linList() {
        Scanner s = new Scanner(System.in);
        LinkedList<String> linList = new LinkedList<String>();
        while (true) {
            System.out.print("Введите строку: ");
            String inputString = s.nextLine();
            if (inputString.isEmpty()) {
                System.out.println("Завершение работы подпрограммы.");
                break;
            } else {
                linList.add(inputString);
            }
        }
        System.out.println("LinkedList: " + linList);
        return linList;
    }
        static LinkedList<String> reverseList(LinkedList<String> linList) {
            LinkedList<String> newList = new LinkedList<String>();
                for (int i = linList.size() - 1; i >= 0; i--) {
                newList.add(linList.get(i));
                }
            return newList;
    }

}

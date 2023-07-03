// Задание
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

package ru.isupov.api.homework3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class task {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList <Integer> ();
        Collections.addAll(list1, -2, 3, 8, 123, 32, -45, 33, 54, 20, 34, 54);
        removeNum(list1);
        minNum(list1);
        maxNum(list1);
        averageValue(list1);
        

    }
    public static void removeNum(ArrayList <Integer> list1){
        ArrayList <Integer> list2 = new ArrayList <Integer> ();
        for(int item : list1){
            if(item%2 != 0){
                list2.add(item);
            }
        }
        System.out.println("Массив из нечетных чисел: " + list2);
    }

    public static void minNum(ArrayList <Integer> list1){
        int min = list1.get(0);
        for(int item : list1){
            if(item < min){
                min = item;
            }
        }
        System.out.printf("Минимальное значение min = %d\n", min);

    }
    public static void maxNum(ArrayList <Integer> list1){
        int max = list1.get(0);
        for(int item : list1){
            if(item > max){
                max = item;
            }
        }
        System.out.printf("Максимальное значение max = %d\n", max);
    }
    public static void averageValue(ArrayList <Integer> list1){
        double sum = 0;
        for (int item: list1) {
            sum += item;
        }
        double res = sum/list1.size();
        System.out.printf("среднее арифметическое чисел равно: %.2f", res);
        }
    
}

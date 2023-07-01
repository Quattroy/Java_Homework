// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package ru.isupov.api.homework2;

public class task2 {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 4, -6, 7, -2, 10, 123, 2};
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++ )
                if( arr[i] < arr[j]) {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        printarr(arr);

    }


    public static void printarr(int [] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
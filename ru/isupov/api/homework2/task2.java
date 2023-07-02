// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package ru.isupov.api.homework2;
import java.io.IOException;
import java.util.logging.*;

public class task2 {
    public static void main(String[] args) throws SecurityException, IOException {
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
        
        Logger logger = Logger.getLogger(task2.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        
        logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
    }


    public static void printarr(int [] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    // public static void loggerSt()throws IOException {
        
    //     Logger logger = Logger.getLogger(task2.class.getName());
    //     //ConsoleHandler ch = new ConsoleHandler();
    //     FileHandler fh = new FileHandler("log.txt");
    //     //logger.addHandler(ch);
    //     logger.addHandler(fh);
        
    //     SimpleFormatter sFormat = new SimpleFormatter();
    //     //XMLFormatter xml = new XMLFormatter();
    //     fh.setFormatter(sFormat);
    //     //fh.setFormatter(xml);
        
    //     //logger.setLevel(Level.INFO);
    //     logger.log(Level.WARNING, "Тестовое логирование 1");
    //     logger.info("Тестовое логирование 2");
    // }

}
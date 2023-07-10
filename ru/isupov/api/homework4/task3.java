// 3. В калькулятор (урок 1 и 2) добавьте возможность отменить последнюю операцию.
package ru.isupov.api.homework4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.Scanner;

public class task3 {
    private static File log;
    private static FileWriter fileWriter;

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)){
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
            char op = '-';
            op = scanner.next().charAt(0);
            LinkedList<Integer> resultat = new LinkedList<Integer>();
            while (op != 'q') {
                System.out.print("Введите операцию: + для сложения, - для вычитания, * для умножения\n, / для деления, u для отмены последней операции, q для выхода из программы ");
                op = scanner.next().charAt(0);
                // op = scanner.nextLine();
                System.out.print("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.print("Введите второе число: ");
                int b = scanner.nextInt();
                int res;

                switch (op) {
                    case '+':
                        res = add(a, b);
                        logStep("Result is: " + res);
                        System.out.println(a + " + " + b + " = " + res);
                        resultat.add(res);
                        break;
                    case '-':
                        res = minus(a, b);
                        logStep("Result is: " + res);
                        System.out.println(a + " - " + b + " = " + res);
                        resultat.add(res);
                        break;
                    case '*':
                        res = multi(a, b);
                        logStep("Result is: " + res);
                        System.out.println(a + " * " + b + " = " + res);
                        resultat.add(res);
                        break;
                    case '/':
                        res = divide(a, b);
                        logStep("Result is: " + res);
                        System.out.println(a + " / " + b + " = " + res);
                        resultat.add(res);
                        break;
                    case 'u':
                        if (resultat.size() > 0) {
                            res = cancel(a, b, resultat);
                            System.out.println("Предыдещий резлуьтат = " + res);
                        } else {
                            System.out.println("Предыдущего значения не существует");
                        }
                        break;
                    default:
                        logStep("Wrong operation!");
                        System.out.println("Wrong operation!");
                        break;
                }
            }
        } finally {
            fileWriter.close();
        }
    }

    private static int divide(int a, int b) {
        if (b != 0)
            return a / b;
        return -1;
    }

    private static int multi(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static Integer cancel(int a, int b, LinkedList<Integer> resultat) {
        a = resultat.size();
        b = resultat.get(a - 1);

        resultat.remove(a);
        return b;
    }

    public static void logStep(String note) throws IOException {
        fileWriter.write(new Timestamp(System.currentTimeMillis()) + " " + note + "\n");
    }
}
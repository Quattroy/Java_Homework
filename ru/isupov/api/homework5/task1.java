// Задание

// Написать простой класс Телефонный Справочник (с помощью HashMap), который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.
// ***Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
// взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.
package ru.isupov.api.homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        String[] data = {
                "123456 Иванов",
                "321456 Васильев",
                "234561 Петрова",
                "234432 Иванов",
                "654321 Иванов",
                "654321 Петрова",
                "564567 Балабанов",
                "435643 Зубилов",
                "456321 Данилов",
                "342567 Синицин"

        };
        String name = "Иванов";
        String [] newContact = {"309845 Сергеев", "874567 Васильев", "573625 Силкин"};
        System.out.println("телефонный справочник: " + task(data));
        System.out.println();
        getContact(name, task(data));
        System.out.println();
        addContact(newContact, task(data));
    }
    

    public static HashMap <String, List<Integer>> task(String[] data){  //создаем телефонный спраочник
        HashMap<String, List<Integer>> spravochnik = new HashMap<>();
        for (String person : data) {
            String[] parts = person.split(" ");


            if (spravochnik.containsKey(parts[1])){//если есть такой ключ уже
                List<Integer> lst =  spravochnik.get(parts[1]); //содаем коллекцию 
                lst.add(Integer.parseInt(parts[0])); // получаем номер паспорта
            }
            else{//если такого ключа еще нет, создаем коллекцию
                ArrayList<Integer> lst = new ArrayList<>();
                lst.add(Integer.parseInt(parts[0]));// передаем первое значение, номер паспорта
                spravochnik.put(parts[1], lst);// добавляем новый элемент и значение из списка номеров паспортов
            }
        }
        // System.out.println(spravochnik);
        return spravochnik;

    }


    public static void getContact(String name, HashMap<String, List<Integer>> spravochnik){
        List<Integer> lst = spravochnik.get(name);// для метода по получению телефона по фамилии
        if (lst != null){
        System.out.println("В телефонном справочнике фамилии " + name + " принадлежат следующие номера: " + lst);
        }
        else{
            System.out.println("Такого контакта не существует");
        }
    }


    public static HashMap <String, List<Integer>> addContact(String [] newContact, HashMap<String, List<Integer>> spravochnik){
        for (String person : newContact) {
            String[] parts = person.split(" ");
            if (spravochnik.containsKey(parts[1])){//если есть такой ключ уже
                List<Integer> lst =  spravochnik.get(parts[1]); //содаем коллекцию 
                lst.add(Integer.parseInt(parts[0])); // получаем номер паспорта
            }
            else{//если такого ключа еще нет, создаем коллекцию
                ArrayList<Integer> lst = new ArrayList<>();
                lst.add(Integer.parseInt(parts[0]));// передаем первое значение, номер паспорта
                spravochnik.put(parts[1], lst);// добавляем новый элемент и значение из списка номеров паспортов
            }
        }
        System.out.println("Обновленный телефонный справочник: " + spravochnik);
        return spravochnik;
    }
}


        



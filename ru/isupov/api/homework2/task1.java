// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, 
//используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package ru.isupov.api.homework2;
import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        Map<String, String> parametr = new HashMap<String, String>();
        parametr.put("name", "Ivanov");
        parametr.put("country", "Russia");
        parametr.put("city", "Moscow");
        parametr.put("age", "null");
        System.out.println(query(parametr));
    }
    public static String query(Map<String, String> parametr) {
        StringBuilder str = new StringBuilder();
        for(Map.Entry<String, String> item : parametr.entrySet()){
            if(item.getValue() != "null") {
                str.append(item.getKey() + " = " + item.getValue() + " and ");
            }
        }
        str.delete(str.toString().length()-5,str.toString().length());
        return str.toString();
    }
}


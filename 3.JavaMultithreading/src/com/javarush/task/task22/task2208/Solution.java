package com.javarush.task.task22.task2208;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);

        System.out.println(getQuery(map));

    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder strB = new StringBuilder();
        for (Map.Entry<String, String> entry: params.entrySet()) {
            if (entry.getValue() != null) {
                if (!"".equals(strB.toString())) {
                    strB.append(" and ");
                }
                strB.append(entry.getKey());
                strB.append(" = '");
                strB.append(entry.getValue());
                strB.append("'");
            }
        }
        return strB.toString();
    }
    }


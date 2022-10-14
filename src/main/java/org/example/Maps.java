package org.example;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12345);
        empIds.put("carl", 56789);
        empIds.put("dave", 65456321);

        System.out.println(empIds);

        System.out.println(empIds.get("carl"));

        System.out.println(empIds.containsKey("dave"));

        System.out.println(empIds.containsValue(12345));

        empIds.put("john", 5555555);
        System.out.println(empIds);

        empIds.replace("John", 7777);
        System.out.println(empIds);

        empIds.putIfAbsent("Steve", 2222);

        empIds.remove("John");








    }
}

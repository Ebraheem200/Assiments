package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEX {

    public static void main(String[] args) {
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("JOE");
        namesLinkedList.add("paul");
        namesLinkedList.add("JOEy");
        System.out.println(namesLinkedList.get(2));
        namesLinkedList.add(1,"jerry");

        String[] names = new String[4];
        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("JOE");
        namesArrayList.add("Jdog");
        namesArrayList.add("JOEy");
        System.out.println(namesArrayList.get(2));

        //{"jong", "paul", "jerry", "paul1"}

    }

}

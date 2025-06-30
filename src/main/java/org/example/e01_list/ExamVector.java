package org.example.e01_list;

import java.util.Vector;

public class ExamVector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("A");
        v.add("B");
        v.add("C");

        System.out.println(v.get(1)); //B

        v.remove("B");
        System.out.println("v");
    }
}

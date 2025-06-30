package org.example.e01_list;

import java.util.Stack;

public class ExamStack {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("first");
        s.push("second");
        s.push("third");

        System.out.println(s.peek());//third

        System.out.println(s.pop());//third
        System.out.println(s.pop());//second

        System.out.println(s);// [first]
    }
}

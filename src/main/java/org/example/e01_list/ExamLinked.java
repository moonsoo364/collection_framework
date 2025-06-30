package org.example.e01_list;

import java.util.LinkedList;

public class ExamLinked {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("사과");
        list.add("바나나");
        list.addFirst("포도");
        list.addLast("딸기");

        System.out.println(list);//[포도, 사과, 바나나, 딸기]
        list.remove(2);//바나나 제거
        System.out.println(list);//[포도, 사과, 딸기]
    }
}

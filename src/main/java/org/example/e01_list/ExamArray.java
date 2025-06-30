package org.example.e01_list;

import java.util.ArrayList;
import java.util.List;

public class ExamArray {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("사과");
        list.add("딸기");
        list.add("바나나");

        System.out.println(list.get(1));//딸기 조회
        list.remove(0);//사과 삭제
        System.out.println(list.get(1));//바나나 조회
        System.out.println(list);// [바나나, 딸기]
    }
}

package org.example.e02_set;

import java.util.HashSet;

public class ExamHashSet {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");//중복 추가

        System.out.println("과일 목록:" + fruits);
        // 원소 확인
        System.out.println("바나나가 포함되었나요? "+fruits.contains("Banana"));

        fruits.remove("Orangs");
        System.out.println("Orange 삭제 후: "+ fruits);
        for(String fruit : fruits){
            System.out.println("과일 : "+ fruit);
        }
    }
}

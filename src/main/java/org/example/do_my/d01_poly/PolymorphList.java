package org.example.do_my.d01_poly;

import java.util.ArrayList;
import java.util.List;

class Animal{
    public void sound(){
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("멍멍!");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("야옹!");
    }
}


public class PolymorphList {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog());
        animals.add(new Cat());

        for(Animal animal : animals){
            animal.sound();
        }
    }
}

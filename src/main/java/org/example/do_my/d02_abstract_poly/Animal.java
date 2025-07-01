package org.example.do_my.d02_abstract_poly;

abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName() { return name; }

    //진료를 위한 추상 메서드
    public abstract void treat();
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void treat() {
        System.out.println(getName() + " (강아지)에게 진드기 약을 발라줍니다.");
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void treat() {
        System.out.println(getName() + "(고양이)에게 발톱을 깎아줍니다.");
    }
}

class Bird extends Animal {
    public Bird(String name){
        super(name);
    }

    @Override
    public void treat() {
        System.out.println(getName() + " (새)에게 날개 검진을 합니다.");
    }
}

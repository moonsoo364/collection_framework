package org.example.do_my.d02_abstract_poly;

import java.util.ArrayList;
import java.util.List;
/**
 * 다형성(Polymorphism)이란 상위타입(인터페이스 또는 부모 클래스)으로 다양한 하위 타입의 객체를 찹조하여,
 * 동일한 메서드 호출이 상화에 따라 다르게 동작하도록 하는 성질
 * 다형성은 Spring MVC, 서비스 레이어 등에서 사용됨
 */
public class AnimalClinic {
    public static void main(String[] args) {
        List<Animal> patientList = new ArrayList<>();

        patientList.add(new Dog("초코"));
        patientList.add(new Cat("나비"));
        patientList.add(new Bird("짹짹이"));

        System.out.println("=== 동물 병원 진료 시작 ===");
        for(Animal animal : patientList){
            animal.treat();
        }
    }
}

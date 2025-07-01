package org.example.e02_set;

import java.util.HashSet;

class User{
    String name;

    public User(String name){
        this.name = name;
    }

    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof User)) return false;
        return this.name.equals(((User) o).name);
    }
    public int hashCode(){
        return name.hashCode();
    }
}
public class ExamUser {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();
        users.add(new User("Alice"));
        users.add(new User("Alice"));  // 중복 제거됨

        System.out.println("사용자 수: " + users.size());  // 1

    }
}

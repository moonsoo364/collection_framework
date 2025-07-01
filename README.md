# 컬렉션 프레임웍 실습
자바 컬렉션 프레임워크 이론 및 개념 실습을 하는 프로젝트
# 컬렉션 프레임워크 란

자바 컬렉션 프레임워크는 데이터를 효율적으로 저장하고 조가하기 위한 표준화된 클래스들의 집합입니다. 배열보다 더 유연하고 다양한 자료구조를 제공합니다.

## 주요 인터페이스

### 1. Collection

- 모든 컬렉션의 최상위 인터페이스

### 2. List

- 순서가 있으며 중복을 허용하는 컬렉션
- 구현체: `ArrayList`, `LinkedList` ,`Vector`

### 3. Set

- 중복을 허용하지 않는 집합
- 구현체: `HashSet` , `LinkedHashSet` ,`TreeSet`

### 4. Queue

- FIFO 방식의 컬렉션
- 구현체: `LinkedList` ,`PriorityQueue`

### 5. Map

- 키와 값의 쌍으로 데이터를 저장
- Collection 인터페이스를 상속받지 않음
- 구현체: `HashMap` ,`LinkedHashMap` ,`TreeMap` ,`Hashtable`

# List

List 인터페이스의 구성은 다음과 같다.

```bash
java.util.Collection
└── java.util.List   (인터페이스)
    ├── java.util.ArrayList     (배열 기반, 비동기)
    ├── java.util.LinkedList    (이중 연결 리스트)
    ├── java.util.Vector        (배열 기반, 동기화됨)
    │   └── java.util.Stack     (후입선출 - LIFO)

```

- `List`는 요소의 **순서 보장**, **중복 허용**이 특징입니다.
- `ArrayList`는 배열 기반으로 랜덤 접근에 유리합니다.
- `LinkedList`는 노드 기반으로 삽입/삭제에 유리합니다.
- `Vector`는 `ArrayList`와 유사하나, 동기화(synchronized)가 기본입니다.
- `Stack`은 `Vector`를 상속한 **LIFO 구조**입니다.

# ArrayList

`ArrayList` 자바에서 가장 많이 사용되는 List 구현 클래스 중 하나로 동적 배열 기반으로 데이터를 저장하는 컬렉션입니다.

### 주요 특징

### 1. 배열 기반

- 내부적으로 배열을 사용해 요소를 저장하며, 크기를 자동으로 조절한다.

### 2. 순서 유지

- 요소를 순서대로 저장하며, 인덱스를 통해 접근이 가능하다.(`get(index)` )

### 3. 중복 허용

동일한 값을 여러 번 저장할 수 있습니다.

### 4. 랜덤 접근에 유리

인덱스를 이용한 접근 속도가 빠릅니다.(O(1)).

### 5. 삽입 삭제가 느리다.

중간에 요소를 삽입하거나 삭제하면 나머지 요소들을 이동시켜야 하므로 속도가 느립니다.

## 예제

```java
package org.example.e01_arraylist;

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

```

# LinkedList

`LinkedList` 는 `List` ,`Deque` ,`Queue` 인터페이스를 구현한 클래스입니다.

Node라는 단위로 데이터를 저장하며 각 노드는 다음 노드를 참조하는 포인터를 가집니다.

## 주요 특징

### 1. 연결 리스트 구조

- 각 요소가 노드를 이루며 앞뒤로 연결됨

### 2. 삽입 삭제

- 중간 삽입, 삭제가 빠르다(O(1) 포인터 변경만 필요)

### 3. 검색 접근

- 인덱스 기반 접근이 느리다(`O(n)` )

### 4. 양방향 구조

`DoublyLinkedList` 형식으로 앞뒤 모두 연결되있다.

## 예제

```java
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

```

### 예제 주소 저장 방식

`LinkedList`는 각 노드가 **데이터 + 이전 노드 주소 + 다음 노드 주소**를 저장합니다.

```
null ← [포도] ⇄ [사과] ⇄ [딸기] → null
         ↑        ↑        ↑
       주소1     주소2     주소3

```

셸 스타일로 간단히 표현하면:

```
[head] -> [포도|next=주소2] -> [사과|next=주소3] -> [딸기|null]

```

# Vector

`Vector` 는 List를 구현한 동적 배열 클래스입니다. 내부적으로 `ArrayList` 와 유사하지만 모든 메서드가 Synchronized 되어 있어 멀티 스레드 환경에서 안전합니다.

## 주요 특징

### 1. 동기화

기본적으로 스레드에 안전함

### 2. 배열 기반

인덱스를 이용한 빠른 접근

### 3. 성능

동기화로 인해 `ArrayList` 보다 느릴 수 있음

## 예제

```java
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

```

# Stack

`Stack` 은 Vector를 상속한 클래스이며 후입선출 자료구조입니다. 마지막에 추가된 요소가 가정 먼저 제거합니다.

## 예제

```java
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

```

## HashSet

HashSet은 자바에서 중복을 허용하지 않고 순서를 보장하지 않는 집합(Set) 자료구조 입니다. 내부적으로는 HashMap을 기반으로 동작하며 해시 함수를 이용하여 데이터를 저장합니다.

## 주요 특징

### 1. 중복 허용 안됨

- 동일한 값은 한 번만 저장됨

### 2. 순서 유지 X

- 입력한 순서와 출력한 순서가 다를 수 있다.

### 3. null 허용

- 하나의 null 값 저장 가능

### 4. 내부 구현

- 내부적으로 HashMap 사용

## 사용 예제

```java
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

```

## 실무에서 활용 예

- 중복 제거가 필요한 경우 (중복 없는 유저 ID 목록, 태그 목록, IP 수집 등)
- 빠른 포함 여부 체크가 필요한 경우 (`contains()` 는 평균 O(1) 시간)

## equals()와 hashCode() 중요성

HashSet은 객체의 `hashCode()` 와 `equals()` 메서드 기반으로 중복을 판단합니다. 사용자 객체를 HashSet에 담을 경우 이둘을 반드시 오버라이드해야 합니다.

```java
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
```

### 1. `if (this == o) return true;`

- **자기 자신과 비교하는 경우**:

  → 두 참조가 같은 객체를 가리키는 경우이므로 `true` 반환.

- 예: `user1.equals(user1)` → `true`

---

### 2. `if (!(o instanceof User)) return false;`

- **타입 체크**:

  → `o`가 `User` 클래스의 인스턴스가 아니면 동등하지 않다고 판단.

- 예: `user1.equals("문자열")` → `false`

---

### 3. `return this.name.equals(((User) o).name);`

- **형변환 후 내부 값 비교**:

  → `o`를 `User`로 형변환하여 `name` 필드 값을 비교.

  → `name`은 문자열(String)이므로 `.equals()`로 비교.
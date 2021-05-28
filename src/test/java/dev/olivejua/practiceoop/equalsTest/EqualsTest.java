package dev.olivejua.practiceoop.equalsTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class EqualsTest {

    @Test
    void equalsTest() {
        Person p1 = new Person("jin", 27);
        Person p2 = new Person("jin", 27);

        assertEquals(p1, p2);
    }

    @Test
    void hashCodeTest() {
        Person p1 = new Person("jin", 27);
        Person p2 = new Person("jin", 27);

        HashMap<Person, Integer> hashMap = new HashMap<>();
        hashMap.put(p1, 1);
        hashMap.put(p2, 1);

        assertEquals(1, hashMap.size());
    }
}


class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person person = (Person) o;
            return name.equals(person.name) &&
                    age==person.age;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }
}

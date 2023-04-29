package com.startjava.lesson_2_3.person;

public class Person {
    String gender = "Male";
    String name = "Alex";
    float height = 1.80f;
    float weight = 85f;
    int age = 30;

    void go() {
        System.out.println("Идет");
    }

    void sit() {
        System.out.println("Сидит");
    }

    void run() {
        System.out.println("Бежит");
    }

    void speak() {
        System.out.println("Говорит");
    }
    
    void learnJava() {
        System.out.println("Учит Java");
    }
}
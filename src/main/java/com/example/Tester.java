package com.example;

public class Tester {
    private final String name;
    private final String surname;
    private final int experienceInYears;
    private final String englishLevel;
    private final double salary;



    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Средний", 50000.0);
    }

    public Tester(String name) {
        this(name, "По умолчанию", 0);}

    public void display() {
        System.out.println("Тестировщик: " + name + " " + surname);
        System.out.println("Опыт: " + experienceInYears + " лет");
        System.out.println("Уровень английского: " + englishLevel);
        System.out.println("Зарплата: " + salary);
        System.out.println();

    }

    public void display(String prefix) {
        System.out.println(prefix);
        System.out.println("Тестировщик: " + name + " " + surname);
        System.out.println("Опыт: " + experienceInYears + " лет");
        System.out.println("Уровень английского: " + englishLevel);
        System.out.println("Зарплата: " + salary);
        System.out.println();
    }

    public void display(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Тестировщик: " + name + " " + surname);
            System.out.println("Опыт: " + experienceInYears + " лет");
            System.out.println("Уровень английского: " + englishLevel);
            System.out.println("Зарплата: " + salary);
            System.out.println();

        }
    }


    public static void printPrimerMethod() {
        System.out.println("Тестировщики:");
    }
}

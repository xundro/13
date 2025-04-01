package com.example;

public class Main {
    public static void main(String[] args) {

        Tester.printPrimerMethod();

        Tester tester1 = new Tester("Ксения", "Дробышева", 5, "Средний", 70000.0);
        Tester tester2 = new Tester("Артем", "Куц", 3);
        Tester tester3 = new Tester("Мария");


        tester1.display();
        tester2.display("Лучший работник: ");
        tester3.display(2);
    }
}

package ru.geekbrains.oop.lesson3.task2;

public class OneTimerWorker extends Employee {

    public OneTimerWorker(String name, String surName, int age, double salary) {
        super(name, surName, age, salary);
    }

    @Override
    public double calculateSalary() {
        return 5000;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Срочный работник, %d лет; Оплата в месяц: %.2f рублей", surName, name, age, salary);
    }
}

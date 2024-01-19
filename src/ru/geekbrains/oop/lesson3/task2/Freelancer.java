package ru.geekbrains.oop.lesson3.task2;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee {
    public Freelancer(String name, String surName, int age, double salary) {
        super(name, surName, age, salary);
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер, %d лет; Оплата в месяц за проделанные работы: %.2f рублей", surName, name, age, salary);
    }
}

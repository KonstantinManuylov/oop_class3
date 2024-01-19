package ru.geekbrains.oop.lesson3.task2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o2.calculateSalary(), o1.calculateSalary());
    }

}

package ru.geekbrains.oop.lesson3.task2;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee[] workers = EmployeeFabric.generateEmployees(15);
        for (Employee worker : workers) {
            System.out.println(worker);
        }

        System.out.println();
        System.out.println("***Сортировка по зарплате, по возрастанию.***");
        System.out.println();


        Arrays.sort(workers, new SalaryComparator());

        for (Employee worker : workers) {
            System.out.println(worker);
        }

        System.out.println();
        System.out.println("***Сортировка по возрасту, по возрастанию.***");
        System.out.println();

        Arrays.sort(workers, new AgeComparator());

        for (Employee worker : workers) {
            System.out.println(worker);
        }
    }

}

package ru.geekbrains.oop.lesson3.task2;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    private static String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
    private static String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

    public static Worker generateWorker() {
        int age = random.nextInt(18, 70);
        int salary = random.nextInt(60000, 120001);
        return new Worker(
                names[random.nextInt(names.length)],
                surnames[random.nextInt(surnames.length)],
                age,
                salary);
    }

    public static Freelancer generateFreelancer() {
        int age = random.nextInt(18, 70);
        int salary = random.nextInt(5000, 12000);
        return new Freelancer(
                names[random.nextInt(names.length)],
                surnames[random.nextInt(surnames.length)],
                age,
                salary);
    }

    public static OneTimerWorker generateOneTimerWorker() {
        int age = random.nextInt(18, 70);
        return new OneTimerWorker(
                names[random.nextInt(names.length)],
                surnames[random.nextInt(surnames.length)],
                age,
                5000);
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     *
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count) {
        Employee[] workers = new Employee[count];
        for (int i = 0; i < count; i++) {
            int workerKind = random.nextInt(0, 3);
            if (workerKind == 0) {
                workers[i] = generateWorker();
            } else if (workerKind == 1) {
                workers[i] = generateFreelancer();
            } else {
                workers[i] = generateOneTimerWorker();
            }
        }
        return workers;
    }

}

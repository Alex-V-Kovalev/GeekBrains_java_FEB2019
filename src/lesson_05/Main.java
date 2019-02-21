package lesson_05;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static ArrayList<Employee> employees = new ArrayList<>();
    static Random random = new Random();

    public static void main(String[] args) {

        initEmployeeList(10);

        System.out.println("Список всех сотрудников:");
        printEmployeesList(employees);
        System.out.println();
        System.out.println();
        reportByAge(employees, 40);
    }

    private static void addRandomPhonesToEmployees() {
        for (Employee worker :
                employees) {
            int count = random.nextInt(4);
            for (int i = 0; i < count; i++) {
                StringBuilder stringBuilder = new StringBuilder("+79");
                for (int j = 0; j < 9; j++) {
                    stringBuilder.append(random.nextInt(10));
                }
                stringBuilder.insert(2, ' ');
                stringBuilder.insert(3, '(');
                stringBuilder.insert(7, ')');
                stringBuilder.insert(8, ' ');
                stringBuilder.insert(12, '-');
                stringBuilder.insert(15, '-');

                worker.addPhone(stringBuilder.toString());
            }
        }
    }

    private static void initEmployeeList(int count) {
        for (int i = 0; i < count; i++)
            employees.add(new Employee("Имя_" + i, "Отч_" + i, "Фам_" + i, 16 + random.nextInt(60)));

        addRandomPhonesToEmployees();
    }

    private static void reportByAge(ArrayList<Employee> employees, int age) {
        int count = 0;
        if (age > 0) {
            System.out.println(String.format("+%1$100s", "+").replace(' ', '-'));
            System.out.println("Отчет по сотрудникам старше " + age + " лет.");
            System.out.println(String.format("+%1$100s", "+").replace(' ', '-'));
            for (Employee worker :
                    employees)
                if (worker.getAge() >= age) {
                    System.out.println(worker.toString());
                    count++;
                }
            System.out.println(String.format("+%1$100s", "+").replace(' ', '-'));
            System.out.println("Всего: " + count + " сотрудников");
            System.out.println(String.format("+%1$100s", "+").replace(' ', '-'));

            for (Employee worker :
                    employees)
                if (worker.getAge() >= age) worker.printEmployeeFile();
        }
    }

    private static void printEmployeesList(ArrayList<Employee> employees) {
        for (Employee worker :
                employees) {
            System.out.println(worker.toString() + ", зарплата:" + String.format("%,.2f", worker.getSalary()));
        }
    }
}

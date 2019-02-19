package lesson_05;

import java.util.ArrayList;

public class Employee {
    private long id;

    private String firstName;
    private String secondName;
    private String lastName;

    private String position;

    private ArrayList<String> emailsList;
    private ArrayList<String> phonesList;
    private double salary;
    private int age;

    private static long lastId;

    public Employee(String firstName, String secondName, String lastName, String position, ArrayList<String> emailsList, ArrayList<String> phonesList, float salary, int age) {
        this.id = ++Employee.lastId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.position = position;
        this.emailsList = emailsList;
        this.phonesList = phonesList;
        this.salary = salary;
        this.age = age;
    }

    public Employee(String firstName, String secondName, String lastName, int age) {
        this(firstName, secondName, lastName, "Соискатель", new ArrayList<>(), new ArrayList<>(), 0.0f, age);
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void addEmail(String email) {
        this.emailsList.add(0, email);
    }

    public ArrayList<String> getEmailsList() {
        return emailsList;
    }

    public void addPhone(String phone) {
        this.phonesList.add(0, phone);
    }

    public ArrayList<String> getPhonesList() {
        return phonesList;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "id: " + String.format("%05d", id) + ", ФИО: " + firstName + " " + secondName + " " + lastName + ", должность: " + position + ", возраст: " + age;
    }

    public void printEmployeeFile() {
        System.out.println();
        System.out.println("--------------- Анкета сотрудника ---------------");
        System.out.println();
        System.out.println("id: " + String.format("%05d", id));
        System.out.println("ФИО: " + firstName + " " + secondName + " " + lastName);
        System.out.println("Возраст: " + age);
        System.out.println("Должность: " + position + "\t\t\tЗарплата:" + salary);
        System.out.println("Контактные данные:");
        if (getPhonesList().size() > 0) {
            System.out.println("Телефон:");
            for (String phone :
                    getPhonesList()) {
                System.out.print(phone + "\t");
            }
            System.out.println();
        } else System.out.println("Телефоны не указаны");
        if (getEmailsList().size() > 0) {
            System.out.println("e-mail:");
            for (String email :
                    getEmailsList()) {
                System.out.print(email + "\t");
            }
            System.out.println();
        } else System.out.println("e-mail не указаны");
    }
}
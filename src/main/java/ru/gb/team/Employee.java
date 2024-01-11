package ru.gb.team;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String position;
    private String number;
    private double salary;
    private int age;

    public Employee(String name, String position, String number, double salary, int age) {
        this.name = name;
        this.position = position;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", number='" + number + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public String getInfoFormat() {
        return String.format("Сотрудник: Имя - %s, " +
                        "Должность - %s, " +
                        "Возраст - %d, " +
                        "Зарплата - %f, " +
                        "Телефон - %s",
                this.name,
                this.position,
                this.age,
                this.salary,
                this.number);
    }

    public static void increaseSummary(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 45) {
                employees[i].setSalary(employees[i].getSalary() + 5000);
            }
        }
    }

    public static void increaseSummary(Employee[] employees, int age, int amount) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > age) {
                employees[i].setSalary(employees[i].getSalary() + amount);
            }
        }
    }
// TRUE если date1 > date2
    public boolean compareDates(LocalDate date1, LocalDate date2) {
        return date1.isAfter(date2);
    }

}

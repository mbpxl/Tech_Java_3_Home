package ru.gb;

import ru.gb.team.Employee;
import ru.gb.team.Leader;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee Vasya = new Employee("Vasya", "Middle Java Developer", "8-800-555-35-35", 200.000,13);
        Employee Oleg = new Employee("Oleg", "Senior Frontend Developer", "8-722-761-19-23", 250.000,50);
        Employee Kirill = new Employee("Kirill", "HR", "8-466-912-43-12", 100.000,20);
        Employee Masha = new Employee("Masha", "QA", "8-909-123-55-08", 50.000,24);
        Employee Angelina = new Employee("Angelina", "Junior Backend Developer", "8-982-235-74-12", 120.000,19);
        Leader boss = new Leader("Batya", "Director", "8-888-888-88-88", 400.000, 44);

        Employee[] employees = {Vasya, Oleg, Kirill, Masha, Angelina, boss}; //todo: USE THIS ARRAY!!!

        //System.out.println(Arrays.toString(employees));
        Employee.increaseSummary(employees);
        //System.out.println(Arrays.toString(employees));

        Employee.increaseSummary(employees, 45, 5000);

        System.out.println(Angelina.compareDates(LocalDate.of(2024, 3, 11), LocalDate.of(2024, 2, 11)));

        boss.increaseSalary(employees, 20);

        System.out.println(Arrays.toString(employees));
    }
}
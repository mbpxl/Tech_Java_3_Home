package ru.gb.team;

public class Leader extends Employee implements Increasible{

    public Leader(String name, String position, String number, double salary, int age) {
        super(name, position, number, salary, age);
    }

    @Override
    public void increaseSalary(Employee[] employees, int amount) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Leader) {
                continue;
            }
            employees[i].setSalary(employees[i].getSalary() + amount);
        }
    }
}

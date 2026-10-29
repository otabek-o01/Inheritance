package Employeee;

public class Employee {
    protected int salary;

    Employee(int salary) {
        this.salary = salary;
    }

    double salary() {
        return salary * 0.05;
    }
}

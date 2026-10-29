package Employeee;

public class Manager extends Employee {
    public Manager(int salary){
        super(salary);
    }

    @Override
    public double salary() {
        return salary * 0.10;
    }

}

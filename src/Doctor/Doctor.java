package Doctor;

import javax.print.Doc;

public class Doctor {
    private String name;
    private double salary;

    public Doctor(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println("Xodim ismi: " + name + ", Oyligi: $" + salary);
    }
}

class Manager extends Doctor {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void showInfo() {
        System.out.println("Menejer ismi: " + getName() + ", Oyligi: $" + getSalary() + ", Bonusi: $" + bonus);
    }
}

class Main {
    public static void main(String[] args) {
        Doctor Dc = new Doctor("Otabek", 1500.0);
        Manager MG = new Manager("Sarvabek", 3000.0, 800.0);

        System.out.println("--- Ma'lumot ---");
        Dc.showInfo();
        MG.showInfo();
    }
}

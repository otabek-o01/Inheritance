package Employeee;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(5000000);
        System.out.println("Manager balance : " + manager.salary());
    }
}

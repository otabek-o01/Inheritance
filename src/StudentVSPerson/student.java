public class student extends Person {
    int grade;
    public student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void printDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Grade: " + grade);
    }
}

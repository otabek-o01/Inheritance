public class Members{
    protected String name;
    public Members(String name){
        this.name = name;
    }
    public void introduce(){
        System.out.println("My Name is "+name);
    }
}

class Student extends Members{
    public Student(String name){
        super(name);
    }
    public static void main(String [] args){
        Student s1 = new Student("Javohir");

        s1.introduce();
    }
}
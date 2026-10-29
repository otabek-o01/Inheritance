package SchoolMembers;

public class SchoolMembrs {
    protected String  fullname;
    public  SchoolMembrs(String fullname){
        this.fullname = fullname;
    }
    public void introduce(){
        System.out.println("My Name is "+fullname);
    }
}

class Teacher extends SchoolMembrs {
    public Teacher(String fullname) {
        super(fullname);
    }
    public static void main(String [] args){
        Teacher teacher = new Teacher("Otabek");
        teacher.introduce();
        teacher.introduce();
    }
}
class students extends SchoolMembrs {
    public students(String fullname) {
        super(fullname);
    }

    public static void main(String [] args){
        students students = new students("Sam");
        students.introduce();
    }
}
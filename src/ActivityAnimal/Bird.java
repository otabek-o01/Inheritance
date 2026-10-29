package ActivityAnimal;

public class Bird extends Animal {
    String wings = "2 Wings";
    public Bird(String name, int age,String eat, String legs) {
        super(name, age, eat, legs);
        this.wings = wings;
    }

    public static void main(String [] args) {
        Bird bird = new Bird("Bird", 25, "grain", "2 legs");
        System.out.println("Name : " + bird.name);
        System.out.println("Age : " + bird.age);
        System.out.println("Eat : " + bird.eat);
        System.out.println("Legs : " + bird.Legs);
        System.out.println("Bird wings : " + bird.wings);

    }
}

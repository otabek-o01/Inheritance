package ActivityAnimal;

public class Cat extends Animal {
    String tail = "Long tail";
    public Cat (String name, int age, String eat, String legs) {
        super(name, age, eat, legs);
        this.tail = tail;
    }
    public static void main(String [] agrs){
        Cat cat = new Cat("Cat", 10, "Milk", "4 legs");
        System.out.println("Animal name is : " + cat.name);
        System.out.println("Animal age is : " + cat.age);
        System.out.println("Animal eat is : " + cat.eat);
        System.out.println("Animal legs is : " + cat.Legs);
    }
}

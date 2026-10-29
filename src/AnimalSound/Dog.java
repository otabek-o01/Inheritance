package AnimalSound;


public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(name + "  = Woof - Woof!");
    }
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        dog.name = "Dog";
        dog.makeSound();
    }
}
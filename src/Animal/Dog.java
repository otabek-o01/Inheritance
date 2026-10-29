public class Dog extends Animal {
    public Dog(String name, int age, String sound, String eat) {
        super(name, age, sound, eat);
    }
    public static void main(String [] args){
        Dog dog = new Dog("Dog", 25, "Vov - Vov", "GO'sht");
        System.out.println("Name : " + dog.name);
        System.out.println("Sound : " + dog.sound + " = Ovoz chiqaradi ");
        System.out.println("Age : " + dog.age);
        System.out.println("Eat : " + dog.eat);
    }
}
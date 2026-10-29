
public class Motorcycle extends  Vehicle{
    public Motorcycle(String carName, String carColor ,String carType , double carPrice) {
        super(carName, carColor, carType, carPrice);
    }

    @Override
    double carPrice() {
        return carPrice / 5 ;
    }


    public static void main(String [] args){
        Motorcycle motorcycle = new Motorcycle("BMW Motorcycle ", "Red", "Bmw m2", 5000.00);
        System.out.println("Motorcycle name is = " + motorcycle.carName);
        System.out.println("Motorcycle color is = " + motorcycle.carColor);
        System.out.println("Motorcycle type is = " +  motorcycle.carType);
        System.out.println("Motorcycle price is = " + motorcycle.carPrice() + "$");
    }
}

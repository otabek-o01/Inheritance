public class Car extends Vehicle{
    public Car(String carName, String carColor, String carType, double carPrice) {
        super(carName, carColor, carType, carPrice);
    }

    @Override
    double carPrice(){
        return carPrice / 2;
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", "Blue", "BMW M5", 35000.000);
        System.out.println("Car Name is = " + car.carName);
        System.out.println("Car Color is = " + car.carColor);
        System.out.println("Car Type is = " + car.carType);
        System.out.println("Car Price is = " + car.carPrice + "$");
    }
}

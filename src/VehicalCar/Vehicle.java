public class Vehicle{
    protected String carName;
    protected String carColor;
    protected String carType;
    protected double carPrice;

    public Vehicle(String carName, String carColor, String carType, double carPrice){
        this.carName = carName;
        this.carColor = carColor;
        this.carType = carType;
        this.carPrice = carPrice;
    }

    double carPrice(){
        return carPrice / 20;
    }
}

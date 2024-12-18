package extends1.overriding;


public class CarMain extends Car {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar car = new GasCar();
        car.move();
    }
}

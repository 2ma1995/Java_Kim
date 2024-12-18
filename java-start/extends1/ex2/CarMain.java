package extends1.ex2;


public class CarMain extends Car {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        GasCar car = new GasCar();
        car.move();
        car.fillUp();
    }
}

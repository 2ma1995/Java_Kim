package static2.ex;

public class Car {
    private static int totalCars = 0;
    private String name;

    public Car(String name){
        System.out.println("차량 구입, 이름:"+name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars(){
        System.out.println("총 구매한차량 : "+totalCars);
    }
}
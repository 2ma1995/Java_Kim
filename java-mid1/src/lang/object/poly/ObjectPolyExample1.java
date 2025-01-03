package lang.object.poly;

public class ObjectPolyExample1
{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        action(dog);
        action(car);
    }

    private static void action(Object obj){
//        obj.sound(); //컴파일 오류, Object는 sound()가 없다.
//        obj.move(); //컴파일 오류, Object는 m ove()가 없다.

//        만약 사용을하고싶으면, 다운캐스팅을 해야함
//        객체에 맞는 다운캐스팅
        if(obj instanceof Dog dog){
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}

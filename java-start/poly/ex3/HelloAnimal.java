package poly.ex3;

public class HelloAnimal extends AbstractAnimal{
//   추상클래스는 오버라이딩을 통해 상속을 받을수 있음
    @Override
    public void sound() {
        System.out.println("HelloAnimal.sound");
    }
}

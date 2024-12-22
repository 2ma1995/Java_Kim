package poly.ex3;

public abstract class AbstractAnimal {
// sound는 자식이 오버라이딩 하는목적으로 만들어짐
    public abstract void sound();

// move는 기능을 상속받아서 사용할 목적으로 만들어짐
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}

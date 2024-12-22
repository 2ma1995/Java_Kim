package poly.ex2;


public class AnimalPolyMain3 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Caw caw = new Caw();
        Animal a = new Animal();
        a.sound();
//                              배열에 새로운 변수 합칠시(inline 베리어블) = ctrl+alt+N
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(),new Duck(),new Pig()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }
//메서드로 추출시 ctrl+alt+M
//  변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}

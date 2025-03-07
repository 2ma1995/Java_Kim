package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

//        Animal 포함 상위타입전달가능
        writeBox(objectBox);
        writeBox(animalBox);
//        writeBox(dogBox); //하한이 Animal
//        writeBox(catBox); //하한이 Animal

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);


    }
//        하한 와일드 카드 ( 설정한 메서드의 들어간 값보다 상위 객체여야한다(Animal) )
    static void writeBox(Box<? super Animal> box){
        box.set(new Dog("멍멍이",100));
    }
}

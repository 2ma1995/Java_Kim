package repeat.generic.ex2;

import repeat.generic.animal.Animal;
import repeat.generic.animal.Cat;
import repeat.generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물",0);
        Dog dog = new Dog("멍멍이",100);
        Cat cat = new Cat("야옹이",50);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);

        Animal fiindAnimal = animalBox.get();
        System.out.println("findAnimal = " + fiindAnimal);
    }
}

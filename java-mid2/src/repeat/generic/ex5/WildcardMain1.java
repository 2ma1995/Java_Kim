package repeat.generic.ex5;

import repeat.generic.animal.Animal;
import repeat.generic.animal.Cat;
import repeat.generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {

        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이",100));

        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printWildcardV1(dogBox);

        WildCardEx.printGenericV2(dogBox);
        WildCardEx.printWildcardV2(dogBox);

        Dog dog = WildCardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildCardEx.printAndReturnWildcard(dogBox);
    }
}

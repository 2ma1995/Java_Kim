package repeat.generic.ex5;


import repeat.generic.animal.Animal;

public class WildCardEx {
    static  <T> void printGenericV1(Box<T> box){
        System.out.println("T = "+box.get());
    }
    // wildCard도입 // ? 에는 Box<Dog>, Box<Cat>, Box<Object> 다 들어올수있다  .
    static void printWildcardV1(Box<?> box){
        System.out.println("? = "+box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }
    //    wildCard
    static void printWildcardV2(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }
    static Animal printAndReturnWildcard(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}

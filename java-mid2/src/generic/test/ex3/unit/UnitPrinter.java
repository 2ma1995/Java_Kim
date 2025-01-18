package generic.test.ex3.unit;

import generic.test.ex3.BioUnit;
import generic.test.ex3.Marine;

public class UnitPrinter {
    public static <T extends BioUnit> void print1(Shuttle<T> t1){
        T unit = t1.out();
        System.out.println("이름 : " +unit.getName() + ", Hp : " +unit.getHp()  );
    }

    public static void print2(Shuttle<? extends BioUnit> t1){
        BioUnit unit = t1.out();

    }
}

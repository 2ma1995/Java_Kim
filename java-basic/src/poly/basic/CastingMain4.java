package poly.basic;

//다운 캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();//문제 없음

        Parent parent2 = new Parent(); // Parent 생성이므로 child인스턴스가 없음
        Child child =(Child) parent2; // 런타임 오류 - ClassCastException
        child.childMethod(); //실행 불가
    }

}

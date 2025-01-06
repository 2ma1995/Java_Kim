package nested.test;
// 정적중첩 클래스
public class OuterClass1 {
    static class NestedClass{
        public void hello(){
            System.out.println("NestedClass.hello");
        }
    }
}

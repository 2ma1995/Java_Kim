package construct;

public class MemberConstruct {
    String  name;
    int age;
    int grade;

//    멤버변수 추가
    MemberConstruct(String name, int age){
//        this.name = name;
//        this.age = age;
//        this.grade  = 50;
//        위 코드 단축변경가능
        this(name,age,50); //변경(*항상 첫줄에만 사용가능*)
    }
//   MemberConstruct(String name, int age) 호출후 -> MemberConstruct(String name,int age ,int grade)
    MemberConstruct(String name,int age ,int grade){
        System.out.println("생성자 호출 name = "+name+",age = "+ age+",grade = "+grade);
        this.name=name;
        this.age=age;
        this.grade=grade;
    }

}

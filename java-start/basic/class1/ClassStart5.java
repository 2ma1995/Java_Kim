package basic.class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;
//      배열의 선언 최적화 아래코드처럼 사용가능
        Student[] students = {student1, student2};
////       for문의 최적화
//        기본 for문
//        for (int i = 0; i < students.length; i++) {
//            System.out.println("이름: " + students[i].name + " 나이 : " + students[i].age + " 성적 : " + students[i].grade);
//        }
//        아래코드는 변수에 담아 출력
//        for (int i = 0; i < students.length; i++) {
//            Student s = students[i];
//            System.out.println("이름: " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
//        }
//        향상된 for문 사용
        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }
        System.out.println("이름: " + students[0].name + " 나이 : " + students[0].age + " 성적 : " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이 : " + students[1].age + " 성적 : " + students[1].grade);

    }
}

package src.array.ex;

public class ArrayEx01Ref {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
//        향상된 for문
//        for (int student : students) {
//            total+=student
//        }
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }
        double average = (double) total / 5;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
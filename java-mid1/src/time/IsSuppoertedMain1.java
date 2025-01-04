package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSuppoertedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); // 년월일 만 있는 메서드에서 초를 불러올수는 없다.
        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("minute = " + minute);
    }
}

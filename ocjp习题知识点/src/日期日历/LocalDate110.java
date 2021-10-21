package 日期日历;

import java.time.LocalDate;

public class LocalDate110 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 01, 31);
        date.plusDays(10);
        System.out.println(date);
    }
}

package 日期日历;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test109 {
    public static void main(String[] args) {
        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
        /*LocalDateTime now = LocalDateTime.now();
        String day = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));//年月日
        String time = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));//年月日 时分秒
        System.out.println("day = " + day);
        System.out.println("time = " + time);*/
    }
}

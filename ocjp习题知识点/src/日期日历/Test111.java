package 日期日历;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test111 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
        dt = dt.plusDays(30);//LocalDate类中的plusDays()方法，用以计算当前日期后推30天
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
        //ISO_DATE 只有年月日
        //ISO_LOCAL_DATE_TIME 有年月日时分秒
        //ISO_DATE_TIME  有年月日时分秒
    }
}

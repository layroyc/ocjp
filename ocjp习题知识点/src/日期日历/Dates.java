package 日期日历;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        // 获取当前日期
        LocalDate now = LocalDate.now();
        // 设置日期
        LocalDate now2 = LocalDate.of(2099, 2, 28);
        System.out.println("now2 = " + now2);
        // 解析日期，格式必须是yyyy-MM-dd
        LocalDate now3 = LocalDate.parse("2018-01-12");
        System.out.println("now3 = " + now3);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formatRs = now.format(dtf);
        System.out.println("formatRs = " + formatRs);
        // 取本月第一天
        LocalDate firstDay = now.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate firstDay2 = now.withDayOfMonth(1);
        System.out.println("firstDay2 = " + firstDay2);
        System.out.println("firstDay = " + firstDay);
        // 取本月第2天
        LocalDate secondDay = now.withDayOfMonth(2);
        LocalDate nextMonthDay = now.with(TemporalAdjusters.firstDayOfNextMonth());
        LocalDate nextYearDay = now.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("secondDay = " + secondDay);
        System.out.println("nextMonthDay = " + nextMonthDay);
        System.out.println("nextYearDay = " + nextYearDay);
        // 明年的这一天
        LocalDate localDate = now.plusYears(1);
        System.out.println("localDate = " + localDate);
        // 当前日期加上往后推20天
        LocalDate plusDate = now.plus(20, ChronoUnit.DAYS);
        LocalDate plusYear = now.plus(10, ChronoUnit.YEARS);
        System.out.println("plusDate = " + plusDate);
        System.out.println("plusYear = " + plusYear);
        // 当前日期往前推10天
        LocalDate minusDay = now.minusDays(10);
        LocalDate minusYear = now.minus(10, ChronoUnit.YEARS);
        System.out.println("minusDay = " + minusDay);
        System.out.println("minusYear = " + minusYear);
        //localDate转Date
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt = now.atStartOfDay(zoneId);
        Instant instant = zdt.toInstant();
        Date fromDate = Date.from(instant);
        System.out.println("fromDate = " + fromDate);
        // Date转LocalDate
        Date date = new Date();
        Instant instantToUse = date.toInstant();
        ZoneId zoneIdToUse = ZoneId.systemDefault();
        LocalDate localDateToShow = instantToUse.atZone(zoneIdToUse).toLocalDate();
        // 比较日期大小
        boolean b1 = localDateToShow.equals(LocalDate.of(2018, 04, 27));
        boolean b2= localDateToShow.equals(LocalDate.of(2018, 04, 26));
        // 判断日期前后  -> false
        boolean b3 = localDateToShow.isAfter(LocalDate.of(2018, 04, 26));//false
        boolean b4 = localDateToShow.isAfter(LocalDate.of(2018, 04, 25));//true
        boolean b5 = localDateToShow.isBefore(LocalDate.of(2018, 04, 26));//false
        boolean b6 = localDateToShow.isBefore(LocalDate.of(2018, 04, 25));//false
        boolean b7 = localDateToShow.isBefore(LocalDate.of(2018, 04, 27));//true
        // 计算两个日期之间的时间间隔   格式为：x年x月x天
        Period between = Period.between(localDateToShow, LocalDate.of(2018, 05, 28));
        long bwDays = ChronoUnit.DAYS.between(localDateToShow, LocalDate.of(2018, 05, 28));
    }
}

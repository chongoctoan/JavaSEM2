package session7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args){
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalDate d1 = d.plusDays(5);
        System.out.println(d1);
        LocalDate d2 = d.plusYears(1);
        System.out.println(d2);
        LocalDate d3 = d.minusYears(1);
        System.out.println(d3);

        //lấy ra đổi tượng gia hạn
        LocalDate t = LocalDate.of(2022,10,15);
        LocalDate t1 = t.plusYears(1);

        LocalDate y = LocalDate.parse("2022-10-09");//chuyển chuỗi thành obj

        long b = ChronoUnit.DAYS.between(t,t1);//khoảng cách ngaày giữa t và t1
        System.out.println(b);

        System.out.println(y.getDayOfWeek());//y là ngày bn trong năm

        LocalDateTime l = LocalDateTime.now();

        LocalDateTime l1 = l.plusHours(1);
        LocalDateTime lt = LocalDateTime.of(2022,10,6,18,30,0);
        LocalDateTime lt1 = LocalDateTime.parse("2022-10-06T18:30:20");
        System.out.println(l);
        System.out.println(lt1);
    }
}

package services;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ErDetFredag {
    public static String erDetFredag(){
        LocalDate today = LocalDate.now();
        DayOfWeek todayRealToday = today.getDayOfWeek();
        String erDetFredag = todayRealToday.toString();
        if (erDetFredag.equalsIgnoreCase("friday")){
            return "It is friday";
        }
        else return "It is not friday";
    }
}

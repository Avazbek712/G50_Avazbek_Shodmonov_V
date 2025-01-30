package task2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Apping {

    public static void main(String[] args) {
        int hours = 0;
        Calendar start = new GregorianCalendar();
        start.set(2020, Calendar.JANUARY, 1);
        Calendar end = new GregorianCalendar();
        end.set(2024, Calendar.SEPTEMBER, 1);
        while (start.before(end)) {
            int week = start.get(Calendar.DAY_OF_WEEK);
            if (week == Calendar.SATURDAY) {
                hours += 4;
            } else if (week == Calendar.SUNDAY) {
                hours += 0;
            } else {
                hours += 8;
            }
            start.add(Calendar.DATE, 1);
        }
        System.out.println("OLim : " + hours + " soat ishlagan!");
    }
}

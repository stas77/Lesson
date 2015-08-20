package lessons;

import com.sun.prism.GraphicsResource;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by user on 31.07.2015.
 */
public class TestCalendar {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println("Год: "+ c.get(Calendar.YEAR));
        System.out.println("Месяц: "+c.get(Calendar.MONTH));
        System.out.println("Day: "+c.get(Calendar.DATE));
        GregorianCalendar birthday = new GregorianCalendar(1999,Calendar.OCTOBER,10);
        GregorianCalendar birthday2=new GregorianCalendar();
        int year=birthday2.get(Calendar.YEAR);
        int month = birthday2.get(Calendar.MONTH)+1; //месяцы начинаются с 0 !!!!!;
        System.out.println(year + " " + month);

        GregorianCalendar dayToHappy=new GregorianCalendar();
        dayToHappy.set(Calendar.YEAR, 2015);
        dayToHappy.set(Calendar.MONTH, 10);
        dayToHappy.set(Calendar.DATE, 15);

        dayToHappy.add(Calendar.MONTH, -2);
        dayToHappy.add(Calendar.DATE,16);

        GregorianCalendar dayToHappy2=new GregorianCalendar();
        dayToHappy2.set(2015,Calendar.JULY,31);
        System.out.println(dayToHappy.equals(dayToHappy2));

        System.out.println();
        //перевод из GregorianCalendar в Date
        GregorianCalendar cal=new GregorianCalendar(2015,05-1,19);
        Date day = cal.getTime();
        System.out.println(day);

        //перевод из Date в GregorianCalendar
        long d=403231213974L;
        Date day2=new Date(d);
        System.out.println(day2);
        GregorianCalendar cal2 = new GregorianCalendar();
        cal2.setTime(day2);
        int cal2Year=cal2.get(Calendar.YEAR);
        System.out.println(cal2Year);

        cal2.setTime(day);
        cal2Year=cal2.get(Calendar.YEAR);
        int cal2MM= cal2.get(Calendar.MONTH);
        System.out.println(cal2Year+" "+cal2MM);


    }
}

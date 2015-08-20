package lessons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by user on 31.07.2015.
 */
public class Razn_Date {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("dd MM yyyy");

        String str1,str2,str;
        Date dt1,dt2,Sdt;
        Long ff;

        str1="27 04 1977";
        str2="21 11 1971";
        dt1=sdf.parse(str1);
        dt2=sdf.parse(str2);
        System.out.println(dt1);
        System.out.println(dt2);
      //  ff=Math.abs(dt1.getTime()-dt2.getTime());
      //  Sdt = new Date(ff);
      //  str=Sdt.toString();
       // Sdt=sdf.parse(str);
      //  System.out.println(Sdt);

        GregorianCalendar cal = new GregorianCalendar();
        GregorianCalendar cal1 = new GregorianCalendar();
        GregorianCalendar cal2 = new GregorianCalendar();
        cal1.setTime(dt1);
        cal2.setTime(dt2);

      //  System.out.println(cal1.get(Calendar.YEAR));
        int y,m,d;
        y=Math.abs(cal1.get(Calendar.YEAR)-cal2.get(Calendar.YEAR));
        m=Math.abs(cal1.get(Calendar.MONTH)-cal2.get(Calendar.MONTH));
        d=Math.abs(cal1.get(Calendar.DATE)-cal2.get(Calendar.DATE));

        cal1.add(Calendar.YEAR,-cal2.get(Calendar.YEAR));
        cal1.add(Calendar.MONTH,-cal2.get(Calendar.MONTH));
        cal1.add(Calendar.DATE,-cal2.get(Calendar.DATE));

      //  cal.set(Calendar.YEAR, y);
      //  cal.set(Calendar.MONTH, m);
     //   cal.set(Calendar.DATE, d);
       //cal.add(Calendar.YEAR,-1000);
        System.out.println("Разница в годах");
        System.out.println(+cal1.get(Calendar.YEAR)+" лет "+cal.get(Calendar.MONTH)+" месяцев "+cal1.get(Calendar.DATE)+" дней");
       // cal.add(cal.MONTH, -cal2.MONTH);
      //  cal.add(cal1.DATE, -cal2.DATE);
       // System.out.println(cal.YEAR + " " + cal.MONTH + " " + cal.DATE);

    }
}

package HomeWork;

/**
 * Created by цербер on 02.08.2015.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DneySrozhdeniy {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("dd MM yyyy");

        String str1,str2;
        Date Sday,dt2,dt;
        GregorianCalendar ToDay,HappyDay,Zday;
        int y1,m1,d1,y2,m2,d2;
        long SD;

        ToDay = new GregorianCalendar();
        HappyDay = new GregorianCalendar();
        Zday = new GregorianCalendar();

        ToDay = (GregorianCalendar) Calendar.getInstance();
       // str1="27 04 1977";
        str2="01 01 1947";
        System.out.println(str2);
      //  dt1=sdf.parse(str1);
        dt2=sdf.parse(str2);
      //  System.out.println(dt1);
        System.out.println(dt2);
        System.out.println(ToDay.get(Calendar.DATE) + " " + ToDay.get(Calendar.MONTH) +
                "  " + ToDay.get(Calendar.YEAR));

      //  ToDay.setTime(dt1);
        HappyDay.setTime(dt2);

        y1=ToDay.get(Calendar.YEAR);
        m1=ToDay.get(Calendar.MONTH);
        d1=ToDay.get(Calendar.DATE);
        y2=HappyDay.get(Calendar.YEAR);
        m2=HappyDay.get(Calendar.MONTH);
        d2=HappyDay.get(Calendar.DATE);

        Zday.add(Calendar.YEAR, -HappyDay.get(Calendar.YEAR));
        Zday.add(Calendar.MONTH, -HappyDay.get(Calendar.MONTH));
        Zday.add(Calendar.DATE, -HappyDay.get(Calendar.DATE));

        System.out.println("Разница в годах");
        System.out.println(+Zday.get(Calendar.YEAR) + " лет " + Zday.get(Calendar.MONTH) +
                " месяцев " + Zday.get(Calendar.DATE) + " дней");

      //  str1="01 01 1970";
        Sday = ToDay.getTime();
        dt= HappyDay.getTime();

        SD=Math.round(Sday.getTime() /86400000L)-Math.round(dt.getTime() /86400000L);
     //   SD=ToDay.get(Calendar.YEAR)*356+;
     //   SD=Math.round(dt.getTime() /86400000L);
     //   System.out.println(dt.getTime());
        System.out.println("Разница в днях: "+SD);


    }
}

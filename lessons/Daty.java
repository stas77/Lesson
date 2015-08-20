package lessons;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 31.07.2015.
 */

public class Daty {
    public static void main(String[] args) {
        Date happyDay = new Date();
        System.out.println(happyDay);
        //long d-кол-во милисикунд
        //прошедших с 1 января 1970 года
        long d = 403231213974L;
        Date happyDay2 = new Date(d);
        System.out.println(happyDay2);
        happyDay2 = new Date(0);
        System.out.println(happyDay2);
        System.out.println();
        System.out.println("Method.before: "+ happyDay.before(happyDay2));
        System.out.println("Method.compareTo: "+ happyDay.compareTo(happyDay2));
        System.out.println("Method.getTime: " + happyDay.getTime());
        happyDay.setTime(-1353453405345L);
        System.out.println(happyDay);
        System.out.println();

        long t = System.currentTimeMillis();
        Date newday=new Date(t);
        SimpleDateFormat sdf=  new SimpleDateFormat("HH:mm:ss | dd:MMMM:yy z Z");
        SimpleDateFormat sdf1= new SimpleDateFormat("h:m:s a| dd:M:yyyy z Z");
        SimpleDateFormat sdf2= new SimpleDateFormat("hh:mm:ss a| d:MM:yy z Z");
        SimpleDateFormat sdf3= new SimpleDateFormat("HH:mm:ss | dd:MMM:yy z Z");
        SimpleDateFormat sdf4= new SimpleDateFormat("yyyy G EEEE dd:MMMM | HH:mm:ss");

        String sdfDay= sdf.format(newday);
        System.out.println(sdfDay);
        sdfDay= sdf1.format(newday);
        System.out.println(sdfDay);
        sdfDay= sdf2.format(newday);
        System.out.println(sdfDay);
        sdfDay= sdf3.format(newday);
        System.out.println(sdfDay);
        sdfDay= sdf4.format(newday);
        System.out.println(sdfDay);


    }
}

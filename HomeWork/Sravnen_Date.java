package HomeWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by цербер on 02.08.2015.
 */
public class Sravnen_Date {
    public static void main(String[] args)  {
        Date inDay,toDay;
        int d1,m1,y1,j;
        int d2,m2,y2;
        String str,str2;
        Calendar cal2;

        Calendar cal=Calendar.getInstance();
        d1=cal.get(Calendar.DATE);
        m1=cal.get(Calendar.MONTH);
        y1=cal.get(Calendar.YEAR);
        System.out.println(d1+" "+m1+" "+y1);

        Scanner sc=new Scanner(System.in);
     //   SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyy");

        System.out.println("ввод даты в формате dd MM yyyy");
        str = sc.nextLine();
        str+=" ";
        str2="";
        j=0;d2=0;m2=0;y2=0;
        for(int i=0;i<str.length();i++){
            if(str.codePointAt(i)==32)   {
                str2+=str.substring(j,i);
                if(d2==0) {d2=Integer.parseInt(str2);}
                else if(m2==0){m2=Integer.parseInt(str2);}
                     else y2=Integer.parseInt(str2);
                j=i+1;
                str2="";
            }
        }
     //   System.out.println(d2+" "+m2+" "+y2);
        cal2=new GregorianCalendar();
        cal2.set(y2,m2-1,d2);
//        cal2.set(Calendar.YEAR, y2);
//        cal2.set(Calendar.MONTH, m2);
//        cal2.set(Calendar.DATE, d2);;
       // System.out.println(cal2.get(Calendar.DATE)+" "+cal2.get(Calendar.MONTH)+" "+cal2.get(Calendar.YEAR));
        if(cal2.get(Calendar.DATE)!=cal.get(Calendar.DATE)) System.out.println("отличается день "+d1+"->"+d2);
        if(cal2.get(Calendar.MONTH)!=cal.get(Calendar.MONTH)) System.out.println("отличается месяц "+m1+"->"+(int)(m2-1));
        if(cal2.get(Calendar.YEAR)!=cal.get(Calendar.YEAR)) System.out.println("отличается год "+y1+"->"+y2);
//        try {
//            inDay = sdf.parse(str);
//            System.out.println(inDay);
//        }
//        catch (ParseException e){
//            System.out.println("ошибочный ввод");
//        }


    }
}

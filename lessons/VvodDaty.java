package lessons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by user on 31.07.2015.
 */
public class VvodDaty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SimpleDateFormat sdf=new SimpleDateFormat("d MM yyyy");
        System.out.println("ввод даты");
        String str =sc.nextLine();
        try{
            Date dd=sdf.parse(str);
            System.out.println(dd);
        }
        catch(ParseException e){
            System.out.println("Ошибочный ввод");
        }
    }
}

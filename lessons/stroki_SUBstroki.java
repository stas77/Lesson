package lessons;

/**
 * Created by user on 14.07.2015.
 */
public class stroki_SUBstroki {
    public static void main(String[] args) {
        String Str1 = "Hello Java!";
        System.out.println(Str1);

        //подстроки
        String Str2=Str1.substring(0,5);
        System.out.println(Str2+" //копирует символы с 0-5");
        String Str3 = "Please "+ Str1.substring(0,3)+"p me!";
        System.out.println(Str3);

        //сцепление строк
        int num=15;
        String strNum=Str1+num;
        System.out.println(strNum);

        //сравнение
        System.out.println("Hello java!".equals(Str1)); //false
        System.out.println("Hello java!".equalsIgnoreCase(Str1)); //true
        System.out.println("Hello java!"==Str1); //false

        //длина строки, кодовые точки и еденицы
        String str4 = "Hello";
        int str4L=str4.length();
        int str4CodePoint=str4.codePointCount(0, str4.length());
        System.out.println("Длина строки: "+str4L+'\n'
                           +"Длина кодовых точек: "+str4CodePoint);
        char oneStr4=str4.charAt(4); //кодовая единица на позиции 4 (0-4)
        System.out.println("oneStr4=str4.charAt(4) "+oneStr4);

        System.out.println("str4.endsWith(\"lo\") "+ str4.endsWith("lo")); //сравнивает окончание
                System.out.println(str4.indexOf("el"));
        System.out.println(str4.compareTo("Hello")); //сравнение строк

        System.out.println('\n'+"новая задача");
        String s1="abCd";
        String s2 ="123456";
        String s3=s1+s2;           //abCd123456
        String s4=s1.substring(2); //Cd
        int x=s2.length();         //6
        String s5=s1.toUpperCase();//"ABCD";
        char c=s1.charAt(0);       //a
        int pos=s1.indexOf("bC");  //1

        String s6="aaaяяяddd".replace("яяя","QQ"); //aaaQQddd
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(c);
        System.out.println(pos);
        System.out.println(s6);


    }
}

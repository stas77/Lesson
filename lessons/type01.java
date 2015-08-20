package lessons;

/**
 * Created by user on 02.07.2015.
 */
public class type01 {
    public static void main(String[] args){
        int x,y;
        int a = 1;
        double b = 7.5;
        long c = 100000L, d = 3333;
        char d1 = 'A';
        boolean e = true;
        short f = 500;
     //   short g = (f + 300);
        short g = (short) (f+300);
        x = 55;
        a = 5;
        x = a++;
        y = ++a;
        System.out.println("a=" + a + "  x=" + x + " y=" + y);

        //сравнение примитывных типов
        int age = 5;
        int length = 5;
        System.out.print("age=length ");
        System.out.println(age==length); //true

        //сравнение ссылочных типов
        String s1 = "java";
        String s2 = new String("java");
        String s3 = "java";
        System.out.print("7=7 ");        System.out.println("7" == "7");//true
        System.out.print("s1=s2 ");      System.out.println(s1 == s2);//false
        System.out.print("s1=java ");    System.out.println(s1 == "java");//true
        System.out.print("s3=java ");    System.out.println(s3 == "java");//true
        System.out.print("s2=s3 ");      System.out.println(s2 == s3);//false
        System.out.print("s1=s3 ");      System.out.println(s1 == s3);//true
        System.out.print("s2=java ");    System.out.println(s2 == "java");//false

        //для сравнения знач. ссылочных типов
        //применяется метод equals
        System.out.println(s1.equals(s2));//true
        System.out.println((int)9.69);

    }
}

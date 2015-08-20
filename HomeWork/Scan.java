package HomeWork;

/**
 * Created by user on 08.07.2015.
 */
import java.util.Scanner; // импортируем класс
public class Scan {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in); // создаём объект класса Scanner
        byte i,j;
        String S,S1,S2 = "I love java";

        j = (byte) (S2.length());
        System.out.println(j);
        System.out.println("Введите посимвольно " + S2);
        S="";
        i=1;
        while (i < j) {
                if(scan1.hasNext()){
                    S1 = scan1.next();
                    S += S1;
                    System.out.println("строка "+S);
                    i++;
                }
        }
        System.out.println("Вы ввели: "+S);
     //   System.out.print(i);
        /*  if(scan1.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            i = scan1.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            System.out.println(i*2);
        } else {
            System.out.println("Вы ввели не целое число");
        }
*/
    }

}

package Exceptions;

/**
 * Created by user on 14.08.2015.
 */
public class Main {
    public static void main(String[] args) {
        int a=3;
        int b=0;

        try{
            System.out.println(a);
            System.out.println(a/b); //намереннный вызов
            System.out.println(b);// ошибки
        }
        catch (ArithmeticException e){//перехват исключений
            System.out.println("Деление на ноль");
        }
        finally {// Участок кода который выполняется все равно
            System.out.println("Но программа все равно работает");
        }
        System.out.println("конец кода");

    }
}

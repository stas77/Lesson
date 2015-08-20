package Exceptions;

/**
 * Created by user on 14.08.2015.
 */
public class TestExThrows {
    static int sum(int a,int b) throws IllegalAccessException, ArithmeticException{
        if(a==5)throw new IllegalAccessException();
        if(a==5/0)throw new ArithmeticException();
        return a+b;
    }

    public static void main(String[] args) {
        try{
            System.out.println(sum(3,4));
            System.out.println(sum(5,6));
        }
        catch (IllegalAccessException | ArithmeticException e){
            System.out.println("Перехват исключения метода");
        }
    }
}

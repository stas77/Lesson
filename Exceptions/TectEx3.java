package Exceptions;

/**
 * Created by user on 14.08.2015.
 */
public class TectEx3 {
    public static void main(String[] args) {
        try{
            for(int i=0;i<10;i++){
                if(i==5)throw new ArithmeticException();
            }
        }catch (ArithmeticException e){
            System.out.println("Перехват сгенерированого исключения");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("Конец программы");
    }
}

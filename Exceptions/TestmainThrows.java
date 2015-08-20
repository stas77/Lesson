package Exceptions;

/**
 * Created by user on 14.08.2015.
 */
public class TestmainThrows {
    public static void main(String[] args) {
        try{
            throw new MyException();
        }catch (MyException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

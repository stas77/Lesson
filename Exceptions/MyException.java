package Exceptions;

import java.io.PrintStream;

/**
 * Created by user on 14.08.2015.
 */
public class MyException extends Exception {
    @Override
    public void printStackTrace(PrintStream s) {
        System.err.println("это моя ошибка");
    }
    @Override
    public String getMessage() {
        return ("Отработал getMessage");
    }
}

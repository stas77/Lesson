package Exceptions.ObjPK;

import java.io.PrintStream;

/**
 * Created by user on 14.08.2015.
 */
public class MyPKexception extends Exception {
    @Override
    public void printStackTrace(PrintStream s) {
        System.err.print("Ошибка объема памяти!!! RAM=");
    }
}

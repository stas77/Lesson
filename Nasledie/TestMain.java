package Nasledie;

import Nasledie.TestClass.NewClass;
import Nasledie.TestClass.SuperClass;

/**
 * Created by user on 12.08.2015.
 */
public class TestMain {
    public static void main(String[] args) {
        SuperClass sc = new SuperClass(4);
        sc.sum(sc);

        sc=new SuperClass(5,5);
        sc.sum(sc);

        NewClass nc=new NewClass(2,2,2);
        nc.sum(nc);
    }
}

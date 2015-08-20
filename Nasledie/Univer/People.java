package Nasledie.Univer;

import java.util.Arrays;

/**
 * Created by цербер on 10.08.2015.
 */
public class People {
    private String surname;
    private int age;

    public People(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static People[] AddStud(People[] std,People[] b){
        int L=std.length+1;
        std= Arrays.copyOf(std, L);
        std[L-1]=b[0];

        // std[L-2].Print();
        //  std[L-1].Print();
        return std;
    }

    public static People[] DelStud(People[] std,int b){
        int L=std.length-1;
        int j;
        People[] st;
        st= Arrays.copyOf(std, L+1);
        std= Arrays.copyOf(std, L);
        // копирование из std в st
        System.arraycopy(st,0,std,0,b);
        System.arraycopy(st,b+1,std,b,std.length-b);
//            j=0;
//            for(int i=0;i<L;i++){
//                if(j==b)j++;
//                st[i]=std[j] ;
//                j++;
//            }
        //   st = Arrays.copyOfRange(std, 0, b);
        // st = Arrays.copyOf(std, L - 3);
        return std;
    }
}

package OOP.Klassy;

/**
 * Created by user on 30.07.2015.
 */
public class Cat_KR {
    Cat_KR(String name2, String col, String sex2, int old2){
        this.name=name2;
        this.color=col;
        this.sex=sex2;
        this.old=old2;
    }
    String color;
    String name;
    String sex;
    int old;

    void print(){
        System.out.println("Кличка: "+name);
        System.out.println("окрас: "+color);
        System.out.println("пол: "+sex);
        System.out.println("возраст: "+old);
        System.out.println();
    }
}

package OOP.Klassy;

/**
 * Created by user on 30.07.2015.
 */
public class BD_KNSTR {
    public BD_KNSTR(String name, String sex, int old, float weight) {
        this.name = name;
        this.sex = sex;
        this.old = old;
        this.weight = weight;
    }

    String name,sex;
    int old;
    float weight;

    void print(){
        System.out.println("Имя:  "+name);
        System.out.println("пол: "+sex);
        System.out.println("возраст: "+old);
        System.out.println("вес: "+weight);

    }

}

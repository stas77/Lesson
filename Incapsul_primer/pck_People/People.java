package Incapsul_primer.pck_People;

/**
 * Created by user on 06.08.2015.
 */
public class People {
    private int age=5;
    private String name;
    private String type;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void say(){
        System.out.println("I want beer! ");
    }
}

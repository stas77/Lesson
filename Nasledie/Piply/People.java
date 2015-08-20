package Nasledie.Piply;

/**
 * Created by user on 10.08.2015.
 */
public class People {
    private String name;
    private String lastName;
    private int age;

    public People(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void drinkMilk(){
        System.out.println("I drink milk! (People)");
    }
}

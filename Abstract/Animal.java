package Abstract;

/**
 * Created by user on 12.08.2015.
 */
public abstract class Animal {
    protected int age;
    protected String type;

    public Animal(int age, String type) {
        this.age = age;
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public abstract void eat();

    public abstract void say();

}

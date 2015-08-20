package Abstract;

/**
 * Created by user on 12.08.2015.
 */
public abstract class Bird extends Animal{
    public Bird(int age, String type) {
        super(age, type);
    }

    @Override
    public void eat() {
        System.out.println("Хру-хрум");
    }

    @Override
    public void say() {
        System.out.println("Кря-кря");
    }
    public abstract void fly();
}

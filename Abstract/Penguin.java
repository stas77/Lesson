package Abstract;

/**
 * Created by user on 12.08.2015.
 */
public class Penguin extends Bird implements Swim,CollectStones {
    public Penguin(int age, String type) {
        super(age, type);
    }
    protected int NStones;

    public int getCollectStones() {
        return NStones;
    }

    public void setCollectStones(int NStones) {
        this.NStones = NStones;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void say() {
       // super.say();
        System.out.println("А мне б поплавать!");
    }

    @Override
    public void fly() {
        System.out.println("Ой, я не умею летать!");
    }

    @Override
    public void collectStones() {
        System.out.println("Я уже насобирал "+NStones+ " камней");
    }

    @Override
    public void swim() {
        System.out.println("Я плаваю со скоростью "+ this.SPEED_SWIM);

    }
}


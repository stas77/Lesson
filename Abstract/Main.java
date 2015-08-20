package Abstract;

/**
 * Created by user on 12.08.2015.
 */
public class Main {
    public static void main(String[] args) {
        Animal penguin1=new Penguin(2, "Королевский");
        penguin1.eat();

        Penguin penguin=new Penguin(2, "Императорский");
        penguin.fly();
        penguin.say();
        penguin.eat();
        penguin.swim();
        penguin.setCollectStones(5);
        penguin.collectStones();
    }
}

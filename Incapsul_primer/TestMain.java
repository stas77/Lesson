package Incapsul_primer;

import Incapsul_primer.pck_Animal.Animal;
import Incapsul_primer.pck_People.People;
import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by user on 06.08.2015.
 */
public class TestMain {
    public static void main(String[] args) {
        Animal cow =new Animal();
        cow.age=2;
        cow.name="Муська";
        cow.type="Cow";

        People man =new People();
        //если public
//        man.age=3;
//        man.name="Jim";
//        man.type="Man";

        //eсли private
        System.out.println("Возраст до изменениня: "+man.getAge());
        man.setAge(15);
        man.setName("Jim");
        man.setType("Man");

        cow.say();
        man.say();
        System.out.println("Возраст после изменениня: "+man.getAge());
    }
}

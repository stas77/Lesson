package Nasledie.Univer;

/**
 * Created by цербер on 10.08.2015.
 */
public class Professor extends People {
    private String science;

    public Professor(String surname, int age, String science) {
        super(surname, age);
        this.science = science;
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }

    public void Print() {
        System.out.println(getSurname() + " " + getAge() + " " + getScience());
    }
}

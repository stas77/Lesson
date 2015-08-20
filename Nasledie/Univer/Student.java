package Nasledie.Univer;

/**
 * Created by цербер on 10.08.2015.
 */
public class Student extends People {
    private String kurs;

    public Student(String surname, int age, String kurs) {
        super(surname, age);
        this.kurs = kurs;
    }

    public String getKurs() {
        return kurs;
    }
    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    public void Print(){
        System.out.println(getSurname()+" "+getAge()+" "+getKurs());
    }

}
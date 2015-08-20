package Nasledie;

import Nasledie.Piply.People;
import Nasledie.Piply.SchollBoy;
import Nasledie.Piply.Student;

/**
 * Created by user on 10.08.2015.
 */
public class Main {
    public static void main(String[] args) {
        People people=new People("Pavel","Novikov",1);
        SchollBoy schoolboy=new SchollBoy("Ann","Gorohova",13,"#99",4.5);
        Student student=new Student("Roman","Gorohov",18,"#99",4.3,"KPI",4.8);

        student.setAge(19);

        people.drinkMilk();
        schoolboy.drinkMilk();
        schoolboy.drinkCola();
        student.drinkMilk();
        student.drinkCola();
        student.drinkBeer();
    }
}

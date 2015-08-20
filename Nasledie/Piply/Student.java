package Nasledie.Piply;

/**
 * Created by user on 10.08.2015.
 */
public class Student extends SchollBoy{
    private String institute;
    private double averageScopeInstitute;

    public Student(String name, String lastName, int age, String school,
                   double averageScopeSchool, String institute,
                   double averageScopeInstitute) {
        super(name, lastName, age, school, averageScopeSchool);
        this.institute = institute;
        this.averageScopeInstitute = averageScopeInstitute;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public double getAverageScopeInstitute() {
        return averageScopeInstitute;
    }

    public void setAverageScopeInstitute(double averageScopeInstitute) {
        this.averageScopeInstitute = averageScopeInstitute;
    }
    public void drinkBeer(){
        System.out.println("I drink Beer!");
    }
    public void drinkMilk(){
        System.out.println("My name is: "+getName()+" and I drink milk!");
        super.drinkMilk();
    }
}

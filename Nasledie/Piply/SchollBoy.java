package Nasledie.Piply;

/**
 * Created by user on 10.08.2015.
 */
public class SchollBoy extends People{
    private String school;
    private double averageScopeSchool;

    public SchollBoy(String name, String lastName, int age,
                     String school, double averageScopeSchool) {
        super(name, lastName, age);
        this.school = school;
        this.averageScopeSchool = averageScopeSchool;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getAverageScopeSchool() {
        return averageScopeSchool;
    }

    public void setAverageScopeSchool(double averageScopeSchool) {
        this.averageScopeSchool = averageScopeSchool;
    }

    public void drinkCola(){
        System.out.println("I drink Cola (schoolBoy)");
    }
    public void drinkMilk(){
        System.out.println("My name is: "+super.getName());
        super.drinkMilk();
    }
}

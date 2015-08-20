package INKAPS.BD;

/**
 * Created by цербер on 09.08.2015.
 */
public class People {
    private String name;
    private int age;
    private String tel;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String WriteBD(){
        String strBD;
        strBD="Имя: "+this.name+" возраст: "+this.age+
                " тел: "+this.tel+" e-mail: "+this.email;
        return strBD ;

    }
}

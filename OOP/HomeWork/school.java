package OOP.HomeWork;

/**
 * Created by цербер on 30.07.2015.
 */
public class school {
    public static void main(String[] args) {
        String[] Tname={"Исаак Абрамович","Элла Арчибальдовна"};
        String[] Uname={"Вован","Ирочка","Григорий"};
        String[] Predm={"Цитология","Пофигистика"};

        int k=Uname.length;
       // school_KNSTR(String tchName, String Uch,String subj, int Znanie, int mark )
        school_KNSTR[] Shkola=new school_KNSTR[Uname.length*Tname.length];
        for(int j=0;j<Tname.length;j++) {
            for (int i = 0; i < Uname.length; i++) {
                Shkola[k*j+i] = new school_KNSTR(Tname[j], Uname[i], Predm[j], 0, 0);
                Shkola[k*j+i].Ocenka();
            }
        }
        for(int j=0;j<Tname.length;j++) {
            System.out.println("Учитель: "+Shkola[k*j].tchName);
            System.out.println("Предмет: " + Shkola[k*j].subj);
            System.out.println("Ученик  Знание  Оценка");
            for(int i=0; i<Uname.length;i++){
                Shkola[k*j+i].print();
            }
            System.out.println();

        }
    }
}

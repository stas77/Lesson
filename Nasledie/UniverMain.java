package Nasledie;

import Nasledie.Univer.People;
import Nasledie.Univer.Professor;
import Nasledie.Univer.Student;

import java.util.Arrays;

/**
 * Created by цербер on 10.08.2015.
 */
public class UniverMain {

//    static void AddStud(Student[] std,Student[] b){
//        int L=std.length+1;
//            Student[] FF = new Student [5];
//            FF=std;
//            FF[L-1]=b[0];
//}

//static Student[] AddStud(Student[] std,Student[] b){
//    int L=std.length+1;
//    // копирование из a в b
//    //  System.arraycopy(a,0,b,0,a.length);
//    std= Arrays.copyOf(std,L);
//    std[L-1]=b[0];
//
//    // std[L-2].Print();
//    //  std[L-1].Print();
//    return std;
//}
//
//    static Student[] DelStud(Student[] std,int b){
//        int L=std.length-1;
//        int j;
//        Student[] st=new Student[L];
//        // копирование из std в st
//        System.arraycopy(std,0,st,0,b);
//        System.arraycopy(std,b+1,st,b,st.length-b);
////            j=0;
////            for(int i=0;i<L;i++){
////                if(j==b)j++;
////                st[i]=std[j] ;
////                j++;
////            }
//        //   st = Arrays.copyOfRange(std, 0, b);
//        // st = Arrays.copyOf(std, L - 3);
//        return st;
//    }


    public static void main(String[] args) {
        int j;
       // Student student[0]=new Student("Иванов",19,400,3,4.3f);
       // Professor professor[0]=new Professor("Кощеев",35,2400,"Цитология",20);
        People[] human=new People[5];
        String[] MasST={"1 Иванов","19","Биология",
                        "2 Сергеев","20","Генетика",
                        "3 Андреева","19","География",
                        "4 Букака","25","информатка",
                        "5 Петров","19","Цитология"};
        Student[] student=new Student[MasST.length/3];
        for(int i=0;i<MasST.length/3;i++){
            j=i*3;
        //    student[i]=new Student();
            //  student[i].setSurname(MasST[j]);
            //  student[i].setAge(Integer.parseInt(MasST[j+1]));
            //  student[i].setKurs(MasST[j + 2]);

            student[i]= new Student(MasST[j],Integer.parseInt(MasST[j+1]),MasST[j + 2]);

        }
//        student[0]=new Student("1Иванов",19,"Биология");
//        student[1]=new Student("2Сергеев",20,"Генетика");
//        student[2]=new Student("3Андреева",19,"География");
//        student[3]=new Student("4Букака",25,"информатка");
//        student[4]=new Student("5Петров",19,"Цитология");

        Professor[] professor=new Professor[3];
        professor[0]=new Professor("Лебедев",35,"Цитология");
        professor[1]=new Professor("Кощеев",50,"пестики и тычинки");
        professor[2]=new Professor("Дуб",50,"зоология");

        // ДОБАВЛЕНИЕ
        Student[] newSTD=new Student[1];
        newSTD[0]=new Student("Кравчук",21,"литература");

        System.out.println();
        System.out.print("добавление нового элемента: ");newSTD[0].Print();
        // вариант 0
        // student= AddStud(student, newSTD);

        // вариант 1
        student=(Student[]) People.AddStud((People[])student, (People[])newSTD);
        // вариант 1,1
      //  People[] t1=student;
      //  People[] t2=newSTD;
       // t1= People.AddStud(t1, t2);

        for(int i=0;i<student.length;i++){
            student[i].Print();
        }
        System.out.println();

        // УДАЛЕНИЕ
        int dl=1;
        System.out.print("удаление элемента: ");student[dl].Print();
        student=(Student[]) People.DelStud((People[]) student, dl);
       // student=People.DelStud(student, dl);
        for(int i=0;i<student.length;i++){
                   student[i].Print();
               }

     //   System.out.print("удаление элемента: ");professor[dl].Print();
      //  professor=(Professor[]) People.DelStud((People[]) professor, dl);
     //   for(int i=0;i<professor.length;i++){
     //       professor[i].Print();
     //   }

    }
}

package OOP.HomeWork;

/**
 * Created by цербер on 30.07.2015.
 */
public class Triangl {
    public static void main(String[] args) {
        float[] stor={3,4,5,6,7,8};
        Triangl_KNSTR[] TR=new Triangl_KNSTR[2];
        int j;
        for(int i=0; i<2;i++){
            j=i*3;
            TR[i]=new Triangl_KNSTR(stor[j],stor[j+1],stor[j+2]);
        }
        for(int i=0; i<2;i++){
            TR[i].print();
        }
    }
}

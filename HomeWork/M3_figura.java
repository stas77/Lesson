package HomeWork;

/**
 * Created by цербер on 22.07.2015.
 */
public class M3_figura {
    public static void main(String[] args) {
        String s1,ch="*";

        s1= String.valueOf(' ');
        for(int i=-3;i<=3;i++){
            if(i<=0){s1=s1+ch;}
            else    {s1=s1.substring(0,s1.length()-1);}
          //  System.out.println(s1.length());
            System.out.println(s1);
        }
    }
}

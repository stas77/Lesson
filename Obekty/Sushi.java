package Obekty;

/**
 * Ссылки на объукты
 */
class Roll{
    int a,b;
}

public class Sushi {
    public static void main(String[] args) {
        Roll R1=new Roll();
        R1.a=2;
        R1.b=3;

        Roll R2=R1;
        System.out.println("R2.a= "+R2.a+" R2.b= "+R2.b);

        R2.b=5;
        System.out.println("R2.b= "+R2.b);
        System.out.println("R1.a= "+R1.a+" R1.b= "+R1.b);
        System.out.println("R2.a= "+R2.a+" R2.b= "+R2.b);

        R1=null;
       // System.out.println(R1.b+" "+R2.b);
    }
}

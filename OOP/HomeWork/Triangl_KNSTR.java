package OOP.HomeWork;

/**
 * Created by цербер on 30.07.2015.
 */
public class Triangl_KNSTR {
    Triangl_KNSTR(float a, float b, float c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    float a,b,c;

    static float Plosh(float s1, float s2, float s3){
        float p=(s1+s2+s3)/2;
        float S=(float)Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
        return S;
    }

    void print(){
        System.out.println("Сторона a= "+a);
        System.out.println("Сторона b= "+b);
        System.out.println("Сторона c= "+c);
        System.out.println("площадь S= "+Plosh(a,b,c));
        System.out.println();
    }
}

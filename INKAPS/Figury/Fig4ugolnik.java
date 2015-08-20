package INKAPS.Figury;

/**
 * Created by user on 06.08.2015.
 */
public class Fig4ugolnik {
    private float a;
    private float b;
    private float c;
    private float d;
    private  float PP;
    private  float SS;

    public float getA() { return a;}
    public void setA(float a) {this.a = a; }
    public float getB() { return b; }
    public void setB(float b) {this.b = b; }
    public float getC() { return c;  }
    public void setC(float c) {  this.c = c;   }
    public float getD() { return d; }
    public void setD(float d) { this.d = d; }

    public float getPP() { return PP; }
    public float getSS() { return SS;}


    public void  Raschet(float a) {
        this.PP = this.a * 4;
        this.SS = (float) (this.a * this.a);
    }

    public void  Raschet(float a,float b) {
        this.PP = this.a * 2+this.b*2;
        this.SS = (float) (this.a * this.b);
    }

    public void  Raschet(float a,float b, float c,float d) {
        float p,r;
        this.PP = this.a +this.b+this.c +this.d;
        p=PP/2;
        r=(p-this.a)*(p-this.b)*(p-this.c)*(p-this.d);
        this.SS = (float)(Math.sqrt(r));
    }
}

package INKAPS.Figury;

/**
 * Created by user on 06.08.2015.
 */
public class Ravnostor3 {
    private float a;
    private float b;
    private float c;
    private  float PP;
    private  float SS;

    public float getSS() {return SS; }
    public float getPP() {return PP; }
    public float getA() { return a; }
    public void setA(float a) { this.a = a; }
    public float getB() { return b; }
    public void setB(float b) {  this.b = b; }
    public float getC() {  return c;}
    public void setC(float c) {this.c = c; }

    public void  Raschet(){
        float p;
        this.PP=this.a+this.b+this.c;
        p=PP/2;
        this.SS=(float)(Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c)));

    }
}

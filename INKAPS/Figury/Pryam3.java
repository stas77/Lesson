package INKAPS.Figury;

/**
 * Created by user on 06.08.2015.
 */
public class Pryam3 {
    private int a;
    private float b;
    private float c;
    private  float PP;
    private  float SS;
    float rr;

    public float getSS() {return SS; }
    public float getPP() {return PP; }
    public int getA() { return a; }
    public void setA(int a) { this.a = a; }
    public float getB() { return b; }
    public void setB(float b) {  this.b = b; }
    public float getC() {  return c;}
    public void setC(float c) {this.c = c; }

    public void  Raschet(){
        this.PP=this.a+this.b+this.c;
        this.SS=((float)(this.a)/2)*this.b;
    }
}

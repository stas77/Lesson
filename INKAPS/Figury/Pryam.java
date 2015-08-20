package INKAPS.Figury;

/**
 * Created by user on 06.08.2015.
 */
public class Pryam {
    private float a;
    private float b;
    private  float PP;
    private  float SS;

    public float getSS() {return SS; }
    public float getPP() {return PP; }
    public void setA(float a) { this.a = a; }
    public float getB() { return b; }
    public void setB(float b) {  this.b = b; }


    public void  Raschet() {
        this.PP = this.a * 2+this.b*2;
        this.SS = (float) (this.a * this.b);
    }
}

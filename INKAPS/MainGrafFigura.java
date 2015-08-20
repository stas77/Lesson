package INKAPS;

import INKAPS.Figury.Fig4ugolnik;
import INKAPS.Figury.Pryam3;
import INKAPS.Figury.Ravnostor3;

/**
 * Created by user on 06.08.2015.
 */
public class MainGrafFigura {
    public static void main(String[] args) {
        Ravnostor3 TRr3 = new Ravnostor3();
        TRr3.setA(5);
        TRr3.setB(5);
        TRr3.setC(5);
        TRr3.Raschet();

        System.out.println("Периметр треуг.= " + TRr3.getPP());
        System.out.println("Площадь треуг.= " + TRr3.getSS());

        Pryam3 TrP =new Pryam3();
        TrP.setA(3);
        TrP.setB(4);
        TrP.setC(5);
        TrP.Raschet();
        System.out.println("Периметр треугP.= " + TrP.getPP());
        System.out.println("Площадь треугP.= " + TrP.getSS());

        Fig4ugolnik KV=new Fig4ugolnik();
        KV.setA(7.5f);
        KV.Raschet(KV.getA());
        System.out.println("Периметр квадр.= " + KV.getPP());
        System.out.println("Площадь квадр.= " + KV.getSS());

        Fig4ugolnik PR=new Fig4ugolnik();
        PR.setA(7.5f);
        PR.setB(1.5f);
        PR.Raschet(PR.getA(), PR.getB());
        System.out.println("Периметр прям.= " + PR.getPP());
        System.out.println("Площадь прям.= " + PR.getSS());

        Fig4ugolnik TRAP=new Fig4ugolnik();
        TRAP.setA(7.5f);
        TRAP.setB(4.5f);
        TRAP.setC(5f);
        TRAP.setD(3f);
        TRAP.Raschet(TRAP.getA(), TRAP.getB(), TRAP.getC(), TRAP.getD());
        System.out.println("Периметр Трапеции= " + TRAP.getPP());
        System.out.println("Площадь Трапеции= " + TRAP.getSS());

        System.out.println();
        System.out.println("Периметр треугP.= " + TrP.getPP());
        System.out.println("Площадь треугP.= " + TrP.getSS());


    }

}

package Obekty;

/**
 * Created by user on 03.08.2015.
 */
public class klass_PK {
    public static void main(String[] args) {
        PK pc1= new PK("Windows","Intel i7","Samsung");
        PK pc2= new PK("McOS","Intel i3","LG");
        PK pc3= new PK("Linux","Intel core2","Philips");
        PK pc4= new PK("Unix","AMD","Sony");
        System.out.println("PK1 "+pc1.OS+" "+pc1.CPU+" "+pc1.monitor);
        System.out.println("PK2 "+pc2.OS+" "+pc2.CPU+" "+pc2.monitor);
        System.out.println("PK3 "+pc3.OS+" "+pc3.CPU+" "+pc3.monitor);
        System.out.println("PK4 "+pc4.OS+" "+pc4.CPU+" "+pc4.monitor);
        System.out.println();
        pc2=pc2.ChangeSystem(pc2,"Linux",pc2.CPU,pc2.monitor);
        pc4=pc1.ChangeSystem(pc4,"Windows",pc4.CPU,pc4.monitor);
        System.out.println("PK1 "+pc1.OS+" "+pc1.CPU+" "+pc1.monitor);
        System.out.println("PK2 "+pc2.OS+" "+pc2.CPU+" "+pc2.monitor);
        System.out.println("PK3 "+pc3.OS+" "+pc3.CPU+" "+pc3.monitor);
        System.out.println("PK4 "+pc4.OS+" "+pc4.CPU+" "+pc4.monitor);
    }
}

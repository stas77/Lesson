package OOP;
// Пример метода с вызовом по ссылке
/**
 * Created by user on 28.07.2015.
 */
public class example_3_1 {
    static void sum(int[]x){
        x[3]+=3;
        System.out.println("Значение а в методе sum-");
        for (int k:x){
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,67,8};
        System.out.println("Значение переменной в глав.методе до вызова sum-");
        for(int k:a){
            System.out.print(k + " ");
        }
        System.out.println();
        sum(a);
        System.out.println();
        System.out.println("Значение переменной в глав.методе после вызова sum-");
        for (int k:a){
            System.out.print(k + " ");
        }
    }




}

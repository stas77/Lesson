package OOP;
//Пример метода с вызовом по значению
/**
 * Created by user on 28.07.2015.
 */
public class exampl_3 {
    static int sum(int a, int b){
        a=a+3;
        System.out.println("Значение а в методе sum-"+a);
        return a+b;
    }
    public static void main(String[] args) {
        int a=5;
        int b=3;
        System.out.println("Значение переменной в глав.методе до вызова sum-"+a);
        System.out.println("Результат вызова метода sum-"+sum(a,b));
        System.out.println("Значение переменной в глав.методе после вызова sum-"+a);
    }
}

package OOP;

/**
 * Created by user on 28.07.2015.
 */
public class example_2 {
    static void sum(int a, int b){// void -ничего не возвращает
        int c=a+b;
        System.out.println(c);
      //  return a+b; // ошибка!!!
    }
    public static void main(String[] args) {
        int a=2;
        int b=3;

        System.out.println("example_2");
        sum(a, b);
    }
}

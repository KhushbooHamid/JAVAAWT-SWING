import java.util.Scanner;

public class Simple_trycatch {
    public static void main(String[] args) {
        int a = 1000;
        Scanner sc = new Scanner(System.in);
        int y =sc.nextInt();
        try
        {
            System.out.println("result is " + a/y);
        }catch(Exception e ){
            System.out.println(e);
        }

    }
}

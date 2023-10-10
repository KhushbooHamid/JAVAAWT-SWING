import java.util.Scanner;

class NegAge extends Exception {
    public NegAge(String msg) {
        super(msg);
    }
}

public class Main {
    public static void main(String[] args) throws NegAge {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter your age");
            int age = sc.nextInt();
            
            if (age < 0) {
                throw new NegAge("invalid age");
            }
            else{
                System.out.println("valid age");
            }
        } catch (NegAge e) {
            System.out.println(e);
        }

    }

}

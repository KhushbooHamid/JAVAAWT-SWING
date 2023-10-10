import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0]=9;
        arr[1]=8;
        arr[2]=78;

        Scanner sc = new Scanner(System.in);
        int div = sc.nextInt();
        int i = sc.nextInt();

        try
        {
            System.out.println(arr[i]);
            System.out.println(arr[0]/div);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);

        }catch(ArithmeticException a)
        {
            System.out.println(a);
        }
    }
    
}

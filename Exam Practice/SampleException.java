import java.util.Scanner;
class Se extends Exception {
    
        public String getMessage()
    {
        return "error occured marks cannot be greater than 100";
    }
        
    }
    

class SampleException 
{
    public static void main(String[] args) {
         int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        try
        {
            if(a>100)
            {
                throw new Se();
            }
        }catch(Se e )
        {
            System.out.println(e.getMessage());
        }
    
}
}

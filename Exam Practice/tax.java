public class tax {
    public static void main(String[] args)
    {
        int salary = 500000;
        double tax = 0;
        if(salary<250000)
        {
            tax = 0;
        }
        else if(salary>=250000 && salary<500000)
        {
            tax = 0.05*(salary-250000);
        }
        else if(salary>=500000 && salary<1000000)
        {
            tax = 0.2*(salary-500000) + 0.05*(salary-250000);
        }
        else
        {
            tax = 0.3*(salary-1000000) + 0.2*(salary-500000) + 0.05*(salary-250000);
        }
        System.out.println("The tax is " + tax);

    }

    
}

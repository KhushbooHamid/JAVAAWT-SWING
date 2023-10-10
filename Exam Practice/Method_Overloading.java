class Student
{
    int s1,s2,s3;
    Student(int s1,int s2,int s3)
    {
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    Student(int s3)
    {
        this(0,0,s3);
    }
    
    void  printDetails()
    {
        System.out.println("s1 is " + s1 + " s2 is " + s2 + " s3 is " + s3);
    }
    
}


public class Method_Overloading {
    public static void main(String[] args)
    {
        Student s1 = new Student(1,2,3);
        Student s2 = new Student(8);
        s1.printDetails();
        s2.printDetails();

    }
    
}

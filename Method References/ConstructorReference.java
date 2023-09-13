interface inter{
    public Student printDetails();
}

class Student
{
    public Student()
    {
        System.out.println("Student Constructor");
    }
    public void printDetails()
    {
        System.out.println("Student Details");
    }
}

public class ConstructorReference {
    
    public static void main(String[] args) {
        inter in=Student::new;
        in.printDetails();
        
    }

}

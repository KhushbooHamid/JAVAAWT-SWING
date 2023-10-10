import java.sql.Date;

class Person
{
    String name;
    String gender;
    int dob;
    int mobile;

    void read(String name, String gender, int i, int mobile)
    {
        this.name = name;
        this.gender = gender;
        this.dob = i;
        this.mobile = mobile;
    }

    void printDetails()
    {
        System.out.println("Name is " + name + "\n gender " + gender + "\n dob " + dob + "\n number " + mobile);
    }

    

}

class Student extends Person
{
    int rollno;
    String dept;

    void printbio()
    {
        System.out.println("Name is " + name + "\n gender " + gender + "\n dob " + dob + "\n number " + mobile);
        System.out.println("rollno is " + rollno + " dept " + dept);
           
    }
}
m,
class Staff extends Person
{
    int empno;
    void print()
    {
    System.out.println("Name is " + name + "\n gender " + gender + "\n dob " + dob + "\n number " + mobile);
    System.out.println("empno is " + empno);
    }

}

public class MulSingle_Inh {
    public static void main(String[] args) {
        Person p = new Person();
        p.read("abc", "male", 123, 9908);
        p.printDetails();
        
        Student s1 = new Student();
        s1.dept="ece";
        s1.printbio();
    }
    
}

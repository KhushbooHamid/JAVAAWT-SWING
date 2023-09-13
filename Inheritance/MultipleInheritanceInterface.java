interface abc{
    void fxn1();
}

interface hjk{
    void fxn2();
}

class big implements abc,hjk{

    public void fxn1()
    {
        System.out.println("fxn1");
    }

     public void fxn2()
    {
        System.out.println("fxn2");
    }
}

public class MultipleInheritanceInterface{
   public static void main(String[] args) {
    big b = new big();
    b.fxn1();
    b.fxn2();
   }
    
}

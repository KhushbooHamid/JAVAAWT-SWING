class Base{
    void fxn1()
    {
        System.out.println("i belong to base class");
    }
}

class Sub1 extends Base{
    void fxn1()
    {
            super.fxn1();
        // System.out.println("i belong to subclass1");
    }
    
}

class Sub2 extends Base{
    void fxn3()
    {
        System.out.println("i belong to subclass2");
    }
}

public class MultipleSingleInheritance {
    public static void main(String[] args) {
        Base b = new Base();
        Sub1 s1 = new Sub1();
        Sub2 s2 = new Sub2();

        b.fxn1();
        s1.fxn1();

    }
}

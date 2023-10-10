import java.util.Set;
import java.util.HashSet;


class Main
{
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(44);
        a.add(5);
        a.add(66);
        a.add(10);

        for(int i:a)
        {
            System.out.println(i);
        }
            


    }
}
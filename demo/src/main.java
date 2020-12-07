import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        A a3 = new A("A.1");
        A a1 = new A("A.2");
        A a2 = new A("B.1");
        A a4 = new A("B.2");
        List<A> aList = new ArrayList<>();
        aList.add(a1);
        aList.add(a2);
        aList.add(a3);
        aList.add(a4);
        aList.sort(Comparator.comparing(A::getName).reversed());
        for (A a : aList){
            System.out.println(a.getName());
        }
    }
}

class A{
    String name;

    public A(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

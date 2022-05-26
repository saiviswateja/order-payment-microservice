import java.util.ArrayList;

public class Carlyx {
    int a ;
    public static void main(String[] args) {
         ArrayList arrayList1 = new ArrayList();
         arrayList1.add("Tara");
         arrayList1.add("Lisa");
         ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList1);
        arrayList2.add(0, "Alice");
        arrayList2.add(1, "Bob");
        arrayList2.add(4, "Tara");
        arrayList2.remove("Tara");
        System.out.println(arrayList2);
    }
}

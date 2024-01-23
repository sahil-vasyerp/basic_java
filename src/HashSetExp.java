import java.util.HashSet;

public class HashSetExp {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("BMW");
        hashSet.add("BMW");
        hashSet.add("audi");
        hashSet.add("rolls roys");

        System.out.println(hashSet);
    }
}

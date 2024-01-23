import java.util.HashMap;

public class HashMapExp {
    public static void main(String[] args)
    {
        HashMap<String,String> hashMap=new HashMap<>();

        hashMap.put("name","sahil");
        hashMap.put("enroll","123456");
        hashMap.put("number","6353413260");
        hashMap.put("address","ahmedabad");

        System.out.println(hashMap.get("name"));
        System.out.println(hashMap);

    }
}

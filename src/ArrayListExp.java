import java.util.ArrayList;

public class ArrayListExp {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("sahil");
        arrayList.add("shubham");
        arrayList.add("abhishek");


        for (String i :arrayList)
        {
            System.out.println("My name is "+i);
        }
//        another example
      /*  for (int i=0;i<=arrayList.size();i++)
        {
            System.out.println("My name is "+i);
        }*/
    }
}

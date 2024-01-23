import java.util.LinkedList;

public class LinkedListExp {
    public static void main(String[] args) {

        LinkedList<String> linkedList=new LinkedList();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("mangoes");
        linkedList.add("grapes");
        linkedList.add("oranges");


        for (String i :linkedList)
        {
            System.out.println("My favourite fruit is "+i);
        }

    }
}

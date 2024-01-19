

public class methodOverriding {

    static void details(String name ,int age)
    {
        System.out.println("Hello My name is "+name+ " and My age is "+age);
    }

}

class company extends methodOverriding {

    static void details(String name, int age) {

        System.out.println("helloo "+name+" - "+age);

    }

    public static void main(String[] args) {

        methodOverriding com=new methodOverriding();
        com.details("sahil",21);

    }
}

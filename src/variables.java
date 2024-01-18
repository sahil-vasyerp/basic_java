public class variables {

    public static void main(String[] args){


//        output by  variables
//        datatypes

        String a="hello my name is sahil"; //string
        Integer b=1234; //integer
        char c='a';  // character
        float d=1.23223F; //Float
        double e=6353413260D; // double
        Boolean f=true; // boolean
        long g=1234567890; // long

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);


//        variables value changes

        String name;
        name="sahil";
        System.out.println(name);
        System.out.println("My name is "+name);

//        concatenate string

        String Name="sahil";
        String Surname="Mahyavanshi";
        String fullname=Name+Surname;

        System.out.println(Name+" "+Surname);

        // concatenate function

        System.out.println(name.concat(Surname));
//
        System.out.println(fullname);


//        multiple variables
        Integer num1=1,num2=2,num3=3;

        System.out.println(num1+num2+num3);


    }
}

public class MethodParameter {

    static void myName(String name,int age)
    {
        System.out.println("My name is "+name + " and age  is "+age);
    }


//    return value in method

     static String myMethod(String fname, int personAge)
    {
        return fname+" "+personAge;

    }

    public static void main(String[] args) {


        myName("shubham",25);


//        return value in method

        System.out.println( myMethod("Sahil ",21));
        System.out.println(myMethod("abhishek",23));

        String allValues=myMethod("dixit",26);

        System.out.println(allValues);
    }

}

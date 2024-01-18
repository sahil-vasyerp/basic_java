public class methodOverloading {

    static String myMeth(String name , int id)
    {
        return name + id;
    }
    static int myMeth(int enrolId)
    {
        return enrolId;
    }

    public static void main(String[] args) {

        int a=myMeth(5154);
        System.out.println(a);

        String b=myMeth("sahil ",+21);
        System.out.println(b);
        System.out.println(myMeth("shubham",26));
    }

}

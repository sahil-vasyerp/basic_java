public class Typecasting {

    public static void main(String[] args){

//        widening casting
//        byte-> short -> Char -> int ->long -> float -> double
        int myInt=9;
        double value=myInt;

        System.out.println(myInt);
        System.out.println(value);


//        narrowing casting-----------------------------------------
        double num=64.255;
        int intValue=(int) num;

        System.out.println(num);
        System.out.println(intValue);

    }
}

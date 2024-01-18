public class operator {
    public static void main(String[] args) {

        int num1=25;
        int num2=16;
//        arithmetic operator
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);


//        Assignment operator

        int val1=15;

         val1 +=4;
         val1 -=4;
         val1 *=4;
         val1 /=4;
         val1 %=4;
         val1 |=4;
        System.out.println(val1);

//        comparison operator

        int x=5;
        int y=6;

        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println(x<y);
        System.out.println(x>y);
        System.out.println(x<=y);
        System.out.println(x>=y);


//        logical operator
        System.out.println(x<y && x<=y);
        System.out.println(x>y || x <= y);
        System.out.println(!(x<y && x<=y));


//
    }
}

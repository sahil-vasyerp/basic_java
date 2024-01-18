import java.util.Scanner;

public class statements {
    public static void main(String[] args) {

        int num1=3;
        int num2=4;

        if (num1==num2)
        {
            System.out.println("value is equal");
        }
        else if (num1 <= num2)
        {
            System.out.println("value of num1 is small than num2");
        }
        else if (num1 >=num2)
        {
            System.out.println("value of num1 is greater than num2");
        }
        else
        {
            System.out.println("Error occur");
        }

//  --------------short hand if..else-----------------------------------------------

        String ab=(num2<=num2)?"trueee": "falseee";
        System.out.println(ab);

//   -----------------Switch statement-----------------------------------------------

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter + for addition \nEnter - for subtraction  \nEnter * for multiplication \n Enter / for devision ");
        char operator=scanner.next().charAt(0);

        System.out.println("Enter a First Number");
        int value1=scanner.nextInt();

        System.out.println("Enter a second Number");
        int value2=scanner.nextInt();

        switch (operator)
        {
            case '+' -> System.out.println(value1 + value2);
            case '-' -> System.out.println(value1-value2);
            case '*' -> System.out.println(value1* value2);
            case '/' -> System.out.println(value1/value2);

        }


    }
}

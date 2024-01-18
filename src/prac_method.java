import java.util.Scanner;

 class movieCheck{
    static void movie()
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("\nEnter your favourite movie:  "+" \n press 1 for 12th fail\n press 2 for Kabir singh \n press 3 for 3 idiots \n press 4 for yeh jawani yeh diwani");
        int choise=scanner.nextInt();
        switch (choise)
        {
            case  1:
            {
                System.out.println("watch 12th fail");
                break;
            }
            case 2:
            {
                System.out.println("watch kabir singh");
                break;
            }
            case 3:
            {
                System.out.println("watch 3 idiots");
                break;
            }
            case 4:
            {
                System.out.println("watch yeh jawani yeh diwani");
                break;
            }
            default:{
                System.out.println("something error in movie selection");
            }
        }




    }
}
public class prac_method {

    static boolean checkAge(int age)
    {
        if (age<18)
        {
            System.out.println("You are under 18");
        }
        return age >=18;
    }



    public static void main(String[] args) {

        Scanner inputValue=new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age=inputValue.nextInt();


        movieCheck movieCheck = new movieCheck();

        if (checkAge(age)){
        movieCheck.movie();
        }
    }
}

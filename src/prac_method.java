import java.util.Scanner;

 class movieCheck{
    static String movie()
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("\nEnter your favourite movie:  "+" \n press 1 for 12th fail\n press 2 for Kabir singh \n press 3 for 3 idiots \n press 4 for yeh jawani yeh diwani");
        int choise=scanner.nextInt();
        String movieNameReturn;

        switch (choise)
        {
            case 1:
            {
                movieNameReturn="watch 12th fail";
                break;
            }
            case 2:
            {
                movieNameReturn="watch kabir singh";
                break;
            }
            case 3:
            {
                movieNameReturn="watch 3 idiots";
                break;
            }
            case 4:
            {
                movieNameReturn="watch yeh jawani yeh diwani";
                break;
            }
            default:
            {
                movieNameReturn="something error";
            }
        }
        return movieNameReturn;

    }
}
public class prac_method {

    static boolean checkAge(int age)
    {
        return age >=18;
    }



    public static void main(String[] args) {

        Scanner inputValue=new Scanner(System.in);

        System.out.println("Enter your age: ");
        int ageInput=inputValue.nextInt();


//        creating object to access another class-----------------------------

        if (checkAge(ageInput))
        {
            movieCheck movieCheck = new movieCheck();
            System.out.println(movieCheck.movie());
        }
        else
        {
            System.out.println("You are under 18");
        }

    }
}

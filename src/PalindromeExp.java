import java.util.Scanner;

public class PalindromeExp {

    public static void main(String[] args)
    {



        System.out.println(palindromCheck());

    }


    private static String palindromCheck() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any name");
        String name=scanner.nextLine();

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(name);
        String reverseName=stringBuilder.reverse().toString();

        String output;
        if (name.equals(reverseName))

        {
            output="Palindrome";
        }
        else {
            output="is not Palindrome";
        }

        return output;

    }
}

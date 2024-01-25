import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExp {
    public static void main(String[] args) {

        pattern();

    }

    private static void pattern() {

        String usrInput="hello vasyErp";

        Pattern pattern=Pattern.compile("vasyerp",Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(usrInput);
        boolean matcherFound=matcher.find();

        if (matcherFound)
        {
            System.out.println("found");

        }
        else
        {
            System.out.println("not found");
        }
    }
}

public class Pattern {
    public static void main(String[] args) {

        patternCall();
    }

    private static void patternCall() {


        int a=5;
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("+ ");
            }
            System.out.println(" ");

        }
    }
}

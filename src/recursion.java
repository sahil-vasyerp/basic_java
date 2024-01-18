public class recursion {

    static int sum(int s)
    {
        if (s>0)
        {
            return s+sum(s-1);
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {

        System.out.println(sum(3));
    }
}

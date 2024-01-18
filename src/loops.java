public class loops {
    public static void main(String[] args) {

//       for loop
        for (int i=1;i<=10;i++)
        {
            System.out.println("number "+i);
        }
//        while loop

        int a=1;
        while (a<=10)
        {
            System.out.println(a);
            a++;
        }

//        do while loop

        int b=1;
        do {
            System.out.println(b);
            b++;
        }while (b<=5);

//        for each loop

        String[] arr={"sahil","shubham","abhishek","devendra"};

        for (String i:arr)
        {
            System.out.println("My name is "+i);
        }

//        break in loop
        for (int i=1;i<=10;i++ )
        {
            System.out.println(i);
            if (i==5)
            {
                break;
            }
        }

//        continue in loop
        for (int s=1;s<=10;s++)
        {
            if (s==5 || s==7)
            {
                continue;
            }
            System.out.println(s);
        }
    }
}

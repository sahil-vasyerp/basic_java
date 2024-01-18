public class array {
    public static void main(String[] args) {

        String[] name={"sahil","manan","vatsal","viraj","dharmesh","rushi","parth","dhaval","harsh","darsh","shubham"};

        System.out.println(name[0]);

//        Output by for loop
        for (String i :name)
        {
            System.out.println("My name is "+i);
        }

//          Changes in array

        name[0]="ahishek";
        System.out.println(name[0]);

//        check array length
        System.out.println(name.length);

//        loop through array

        String[] cars={"bmw","audi","range-rover","verna","swift"};

        for (int i=0;i< cars.length;i++)
        {
            System.out.println("My favourite car is "+ cars[i]  );
        }

//        multi-dimensional Array

        int[][] myNum={{2,1,3,5},{5,6,8,9,7}};

        System.out.println(myNum[0][2]);
        System.out.println(myNum[0][3]+myNum[1][2]);

        for (int i:myNum[1])
        {
            System.out.println(i);
        }
    }
}

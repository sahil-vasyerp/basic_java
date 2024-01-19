

//Single  leval inheritance
public class Inheritance {
    String name="sahil";
    String emailId="sahil@vasyerp.com";

}
class Info extends Inheritance{
    String address="ahmedabad";
}
class Details extends Inheritance{

    long number=6353413260L;
    int salary=50000;

    public static void main(String[] args) {
        Details details=new Details();
        System.out.println(details.name+" " +details.emailId+" "+details.number+" "+details.salary);

        Info info=new Info();
        System.out.println(info.address);

    }
}


abstract class Car
{
    abstract void run();
}

class Bmw extends Car {
    void run()
    {
        System.out.println("BMW is best car");
    }

}
class Audi extends Car
{
    void run()
    {
        System.out.println("Audi is best  car");
    }
}
public class Abstract {
    public static void main(String[] args) {

        Audi c=new Audi();
        c.run();
    }
    }

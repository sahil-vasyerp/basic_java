

class Bank{
    float getRateOfInterest()
    {
        return 0;
    }
}
class Axis extends Bank{
    float getRateOfInterest(){
        return 7.2f;
    }
}
class icici extends Bank{
    float getRateOfInterest()
    {
        return 7.9f;
    }
}
class hdfc extends Bank{
    float getRateOfInterest()
    {
        return 6.8f;
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Bank bank;

        bank=new Axis();
        System.out.println(bank.getRateOfInterest());

        bank=new icici();
        System.out.println(bank.getRateOfInterest());

        bank=new hdfc();
        System.out.println(bank.getRateOfInterest());
    }
}

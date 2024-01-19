public class ConstructorPrac {

    String name;
    int age;
    int salary;

    public ConstructorPrac(String n, int a, int s)
    {
        name=n;
        age=a;
        salary=s;
    }

    public static void main(String[] args) {
        ConstructorPrac constructorPrac=new ConstructorPrac("sahil",21,50000);
        System.out.println("My name is "+constructorPrac.name+" and my age is "+constructorPrac.age+" My salary is "+constructorPrac.salary);
    }
}

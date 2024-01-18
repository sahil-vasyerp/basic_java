class Main2{
    String name="sahil";
    int age=21;

}
public class classObjects {

    int x=13;
    int y;
    public static void main(String[] args) {

        classObjects clsObj=new classObjects();
        System.out.println(clsObj.x);

//        in java we can creates multiple objects

        classObjects obj1=new classObjects();
        obj1.y=55;
        System.out.println(obj1.x + obj1.y);


//        calling another class by creating object
        Main2 obj2=new Main2();
        System.out.println(obj2.name+obj2.age);
    }
}

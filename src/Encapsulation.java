 class Students {
     private String name;
     private int salary;

     public String getName() {
         return name;
     }
     public int getSalary()
     {
         return salary;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setSalary(int salary) {
         this.salary = salary;
     }
 }
public class Encapsulation {
    public static void main(String[] args) {

        Students obj=new Students();
        obj.setName("sahil");
        obj.setSalary(50000);
        System.out.println("My name is "+obj.getName()+" and salary is " +obj.getSalary());
    }
}

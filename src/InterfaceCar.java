interface Vehicles{
    void runCar();
}
public class InterfaceCar implements Vehicles {

    @Override
    public void runCar() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        InterfaceCar obj=new InterfaceCar();
        obj.runCar();
    }
}

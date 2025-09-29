public class LiskovPrinciple {

    public static void main(String [] args)
    {
        Car car =new Car();
        Bycycle bycycle=new Bycycle();
        System.out.println(car.hasEngine());
        System.out.println(car.getNoOfWheels());
        System.out.println(bycycle.getNoOfWheels());




    }
}

 class Vehicle
{
    public int getNoOfWheels()
    {
        return 4;
    }

}
class EngineVehicle extends Vehicle
{
    public Boolean hasEngine()
    {
        return true;
    }

}
class Car extends EngineVehicle
{

}

class Bycycle extends Vehicle
{
    @Override
    public int getNoOfWheels()
    {
        return 2;
    }
}

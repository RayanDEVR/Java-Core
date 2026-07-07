abstract class Car {
    public abstract void drive(); 

    public void fly() {
        System.out.println("flying...");
    }
}
 
class Toyota extends Car
{
    public void drive()
    {
        System.out.println("driving...");
    }
}
 
 class AbstractKeyword {
     public static void main (String [] args)
    {
        Car obj = new Toyota();
        obj.drive();
        obj.fly();
    }
}

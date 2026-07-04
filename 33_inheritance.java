import tools.*;

class Inheritance extends AdvCalc {
    public static void main (String [] args)
    {
        AdvCalc obj = new AdvCalc();

        int r1= obj.add(2,3);
        int r2= obj.sub(4,1);
        int r3= obj.multi(4,5);
        double r4= obj.div(20,5);

        System.out.println(r1 + " " +r2 + " "+ r3 + " " +r4);
    }
}

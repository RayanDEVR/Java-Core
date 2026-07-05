
//final - variable, method, class

class Calc 
 {
    final public void show() {
        System.out.println("in Calc");
    }

    public int add(int a, int b) {
        return a + b;
    }
}

 final class AdvCalc extends Calc {
    //   public void show() {                   //error
    //     System.out.println("in AdvCalc"); 
    //   } 
}

// class SciCalc extends AdvCalc                //error
// {

// }


class FinalKeyword 
{
    public static void main (String [] args)
    {
       final int a = 45;
       // a = 40;                              // error

       System.out.println(a);
        

       Calc obj = new Calc();
       obj.show();
       int r1 = obj.add(3, 4);
       
       System.out.println(r1);
    }    
}

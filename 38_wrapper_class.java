

class WrapperClass
{
    public static void main (String [] args)
    {
        int num = 4;
        Integer num1 = new Integer(num);     //boxing
        Integer num2 = num;                 //autoboxing

        
        int num3 = num2.intValue();        // unboxing
        int num4 = num2;                    //auto-unboxing
    
        System.out.println(num4);


        String str = "12";
        int num5 = Integer.parseInt(str);

        System.out.println(num5 * 2);
    }
}

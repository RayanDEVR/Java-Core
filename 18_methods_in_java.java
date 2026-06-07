 class Computer 
{
    public void playmusic()

    {
        System.out.println("Music playing...");
    }

    public String getMeAPen(int cost)

    {
        if (cost >= 10)
        return "Pen";

        return "Nothing";
      
    }
}

 class Methods
{
    public static void main (String args[])
    {
        Computer obj = new Computer();
        obj.playmusic();
       String str = obj.getMeAPen(15);
        System.out.println(str);
    }
}
class Mobile{
    String name;
    int price;
    static String type;

    public void show()
    {
        System.out.println(name + "(" + type + "): " + price);
    }
}

class StaticVariable {
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.name = "Apple";
        Mobile.type = "s";
        obj1.price = 1200;

        Mobile obj2 = new Mobile();
        obj2.name = "Samsung";
        Mobile.type = "r";
        obj2.price = 1500;

        Mobile.type = "Smartphone";

        obj1.show();
        obj2.show();

    }
}

class Human {
    String name;
    int age;

      public Human()                      //default Constructor
     {
        name = "Rayan";
        age = 20;
     }

      public Human(String n, int a)       //Parameterized Constructor
     {
        name = n;
        age = a;
     }

      public void Person()
     {
        System.out.println(name + ": " + age);
     }
}

class ParameterizedConstructor {
    public static void main(String[] args)
    {
        Human p1 = new Human();
        p1.Person();

        Human p2 = new Human("Radoan", 23);
        p2.Person();
    }
}

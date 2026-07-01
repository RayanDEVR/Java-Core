class Human {
    int roll;
    String name;

    public Human()
    {
        name = "Rayan";
        roll = 18;
    }

    public void Student()
    {
        System.out.println(name + ": " + roll);
    }
}

class Constructor {
    public static void main(String[] args) {

        Human s1 = new Human();
        s1.name = "Samiul";
        s1.roll = 12;
        s1.Student();

        Human s2 = new Human();
        s2.Student();
    }
}

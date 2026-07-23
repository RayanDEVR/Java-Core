record Human(String name, int age)
{
    public Human() 
    {
        this("null", 0);
    }

    public String toString() 
    {
        return name + ": " + age;
    }
}

class RecordClass
{
    public static void main(String[] args) 
    {
        Human a1 = new Human("Rayan", 12);
        Human a2 = new Human();

        System.out.println(a1);
        System.out.println(a2);
    }
}
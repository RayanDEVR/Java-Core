class Student
{
   String name;
   int roll;
   float gpa;

   public void Myself(){
       System.out.println(name);
       System.out.println(roll);
       System.out.println(gpa);
   }
}

class OOP{
    public static void main(String args[])
    {   Student a = new Student();
        a.name = "Rayan";
        a.roll = 45;
        a.gpa = 4.9f;

        a.Myself();
    }
}
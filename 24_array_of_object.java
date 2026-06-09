class Student
{
    String name;
    int roll;
    int marks;
}

class ArrayOfObject
{
public static void main(String args[])
{
   
    Student s1 = new Student();
    s1.name = "Rayan";
    s1.roll = 23;
    s1.marks = 55;

    Student s2 = new Student();
    s2.name = "Samiul";
    s2.roll = 34;
    s2.marks = 65;

    Student s3 = new Student();
    s3.name = "Abdullah";
    s3.roll = 45;
    s3.marks = 59;

    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for(int i=0; i<students.length; i++)
    {
        System.out.println(students[i].name + "(" + students[i].roll + ")" + ":" + " " + students[i].marks);
    }

}
    
}

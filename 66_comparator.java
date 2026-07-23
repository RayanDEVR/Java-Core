import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int age;
    String name;

    public Student(String name, int age) 
    {
        this.age = age;
        this.name = name;
    }

    public String toString() 
    {
        return   name + ": " + age ;
    }
}

class ComparatorDemo 
{
    public static void main(String[] args) 
    {
        Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;
                
        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Rayan", 12 ));
        studs.add(new Student("Abdullah",25));
        studs.add(new Student("Samiul", 20));
        studs.add(new Student("Radoan", 27));

        Collections.sort(studs, com);

        for(Student s: studs)
        {
            System.out.println(s);
        }
    }   
}

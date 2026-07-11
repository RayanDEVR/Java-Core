enum Day 
{
    Saturday,
    Sunday,
    Monday,
    Tueasday,
    Wednesday,
    Thursday,
    Friday;
}

class Enum {
    public static void main(String[] args) {
        Day[] today = Day.values();

        for (Day d : today)
        {
            System.out.println("Day-" + 0 + (d.ordinal() + 1) + ": " + d);
        }
    }
}


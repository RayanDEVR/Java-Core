import java.util.HashMap;
import java.util.Map;

class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Rayan", 60);
        students.put("Samiul", 70);
        students.put("Abdullah", 50);
        students.put("Radoan", 68);
        

        for (String key : students.keySet())
        {
            System.out.println(key + ": " + students.get(key));
        }

    }
}

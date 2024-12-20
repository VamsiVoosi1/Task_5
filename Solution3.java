package task5;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Solution3 {
public static void main(String[] args) {
            // Create a list of student names
            List<String> studentNames = new ArrayList<>();
            studentNames.add("Ashwin");
            studentNames.add("Bharath");
            studentNames.add("Prasad");
            studentNames.add("Naveen");
            studentNames.add("Eswaran");
            studentNames.add("Balaraju");
            studentNames.add("Sai Prasad");
            studentNames.add("Ajay Kumar");
            studentNames.add("Gowtham");
            studentNames.add("Hemanth");
            // Filter the students whose names start with "A" using a lambda expression and the Stream API
            List<String> filterStudents = studentNames.stream()
                    .filter(name -> name.startsWith("A"))
                    .collect(Collectors.toList());

            // Print the filtered list
            System.out.println("Students whose names start with A :\n" +filterStudents);

        }
    }


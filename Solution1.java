package task5;
import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;
public class Solution1 {
        public static void main(String[] args) {
            Stream<String> names = Stream.of("aBc", "d", "ef");
            List<String> upperCase = names
                    .map(String::toUpperCase) // Convert each string to uppercase
                    .collect(Collectors.toList()); // Collect the result into a list
            // Print the resulting list
            System.out.println(upperCase);
        }
    }
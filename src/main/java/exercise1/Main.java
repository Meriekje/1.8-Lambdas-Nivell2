package exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Tom", "Alex", "John", "Amy", "Paul", "Art");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A") && name.length() == 3)
                .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}


package exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 55, 44);
        String result = numbers.stream()
                .map(num -> (num % 2 == 0 ? "e" : "o") + num)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
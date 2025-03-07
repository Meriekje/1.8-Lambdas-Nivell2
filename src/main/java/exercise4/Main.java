package exercise4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Object> mixedList = List.of("apple", "banana", "carrot", "1", "23", "peach", "34");

        mixedList.stream()
                .sorted((o1, o2) -> {
                    if (o1 instanceof String && o2 instanceof String) {
                        String s1 = (String) o1;
                        String s2 = (String) o2;
                        return (s1.contains("e") ? -1 : 1) + (s1.charAt(0) - s2.charAt(0));
                    }
                    return 0;
                })
                .map(item -> {
                    if (item instanceof String) {
                        return ((String) item).replace('a', '4');
                    }
                    return item;
                })
                .filter(item -> {
                    if (item instanceof String) {
                        try {
                            Integer.parseInt((String) item);  // Check if the string is numeric
                            return true;
                        } catch (NumberFormatException e) {
                            return false;
                        }
                    }
                    return false;
                })
                .forEach(System.out::println);
    }
}
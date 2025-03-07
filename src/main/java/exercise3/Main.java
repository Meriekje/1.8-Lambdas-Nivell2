package exercise3;

@FunctionalInterface
interface Operation {
    float operation(float a, float b);
}

public class Main {
    public static void main(String[] args) {
        Operation add = (a, b) -> a + b;
        System.out.println("Addition: " + add.operation(10, 5));

        Operation subtract = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtract.operation(10, 5));

        Operation multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiply.operation(10, 5));

        Operation divide = (a, b) -> a / b;
        System.out.println("Division: " + divide.operation(10, 5));
    }
}

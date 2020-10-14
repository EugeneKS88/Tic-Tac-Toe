import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String inputUpper = input.toUpperCase();
        boolean output = inputUpper.startsWith("J");
        System.out.println(output);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int value;
        do {
            value = scanner.nextInt();
            count++;
        } while (value != 0);
        System.out.println(count - 1);
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int x = a; x <= b; x++) {
            sum += x;
        }
        System.out.println(sum);
    }
}
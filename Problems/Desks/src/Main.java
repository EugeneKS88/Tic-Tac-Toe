import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gr1 = scanner.nextInt();
        int gr2 = scanner.nextInt();
        int gr3 = scanner.nextInt();
        System.out.println((gr1 / 2) + (gr1%2) + (gr2 / 2) + (gr2%2) + (gr3 / 2) + (gr3%2));
    }
}
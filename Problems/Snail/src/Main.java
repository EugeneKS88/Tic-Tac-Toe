import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int days = (H-1-B)/(A-B)+1;
        System.out.print(days);
    }
}
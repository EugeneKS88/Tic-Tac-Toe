import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String noWspaceline1 = line1.replace(" ", "");
        String noWspaceline2 = line2.replace(" ", "");
        System.out.println((noWspaceline1.equals(noWspaceline2)));
    }
}
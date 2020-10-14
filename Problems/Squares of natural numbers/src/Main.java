import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int i = 1;
        int result = i * i;

       while (result <= n) {
            System.out.println(result);
            i++;
        }
    }
}
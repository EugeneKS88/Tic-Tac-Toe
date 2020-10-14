import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // start of the list
        int b = scanner.nextInt(); // end of the list
        int n = scanner.nextInt(); // divisor
        int output = 0;


        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                output++;
            }
        }

        System.out.println(output);


    }
}
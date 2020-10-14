import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int max = num;

        while (num != 0) {

            if(max < num){
                max = num;
            }
            num = scan.nextInt();
        }

        System.out.println(max);
    }
}


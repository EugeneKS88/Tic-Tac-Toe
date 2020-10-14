import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();
        int n3 = (d1%10); //3 - ones
        int n2 = ((d1%100)/10); //2 - tens
        int n1 = (d1/100); //0 - hundreds
        int output = n3*100 + n2*10 + n1;
        System.out.print(output);
    }
}
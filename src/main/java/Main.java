import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double d = scan.nextInt();
        int a = (int) scan.nextDouble();
        scan.close();

        System.out.println(d);
        System.out.println(a);
    }
}

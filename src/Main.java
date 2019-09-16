import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào usd: ");
        usd = sc.nextDouble();
        double convertToVnd = usd * vnd;
        System.out.println("Số tiền " + usd + " sang tiền việt: " + convertToVnd);

    }
}

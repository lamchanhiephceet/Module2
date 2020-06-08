import java.util.Scanner;
public class Chuyen_doi_tien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd, cash, vnd = 23000;
        System.out.println("Nhap so tien USD can chuyen:");
        usd = scanner.nextInt();

        cash = usd*vnd;
        System.out.printf("%-20.2f%s", cash, "VND");
    }
}

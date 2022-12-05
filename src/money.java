import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        double USD = enterNumber();
        double VND = USD * 23000;

        System.out.print("Giá trị VND: " + VND);
    }

    public static double enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        double n = scanner.nextDouble();
        return n;
    }

}

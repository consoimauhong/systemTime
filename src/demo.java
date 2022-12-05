import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Greeting: ");
        String greeting = sc.nextLine(); // câu lệnh khi chạy mình nhập vào
        String result = "hello" + greeting;
        System.out.println(result);


        String myName = "Teo";
        System.out.printf(result + "My name's %s", myName);
        sc.close();
    }
}

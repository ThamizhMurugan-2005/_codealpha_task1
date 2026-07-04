import java.util.Scanner;
public class BusPassSystem {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter Name:");
 String name = sc.nextLine();
 System.out.println("Enter Route:");
 String route = sc.nextLine();
 System.out.println("Enter Amount:");
 int amount = sc.nextInt();
 if(amount >= 500) {
 System.out.println("Payment Successful");
 System.out.println("Bus Pass Generated");
 System.out.println("Name: " + name);
 System.out.println("Route: " + route);
 } else {
 System.out.println("Payment Failed");
 }
 }
}
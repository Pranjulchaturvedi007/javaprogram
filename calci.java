import java.util.Scanner;
public class calci {
    public static void main(String[] args) {
        // Create a Scanner Object.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcomme to the Jerry's Personal Calci: ");
        System.out.println("Please Enter the First Nuber : ");
        int myFirstNum = scanner.nextInt();
        System.out.println("Please Enter the Second Number: ");
        int mySecondNum = scanner.nextInt();
        int sum = myFirstNum + mySecondNum;
        System.out.println("Sum of number: "+ sum);
    }
}
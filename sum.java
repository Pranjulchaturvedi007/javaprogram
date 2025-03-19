import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        //Now Create a Scanner object.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calulator: ");
        System.out.println("Please Enter the First Number: ");
        int myFirstNum = scanner.nextInt();
System.out.println("Now, Please Enter the Second Number: ");
int mySecondNum = scanner.nextInt();
int sum = myFirstNum + mySecondNum;
    }
}

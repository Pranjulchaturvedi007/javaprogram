import java.util.Scanner;
public class swapping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swapping Station\n\n");
        System.out.println("Enter the value of A:");
        int a = input.nextInt();
        System.out.println("Enter the value of B:");
        int b = input.nextInt();
     int c = a;
     a = b;
     b = c;
     System.out.println("Swapping Done !");
     System.out.println("A: "+ a);
     System.out.println("B: "+b);



    }
}

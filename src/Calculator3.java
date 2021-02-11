import java.util.Scanner;

public class Calculator3 implements MyCalculator{
    @Override
    public void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        if (b==0)
        {
            System.out.println("Invalid Input");
        }
        else {
            int c = a + b;
            System.out.println(c);
        }
    }

    @Override
    public void sub() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        int c = a-b;
        System.out.println(c);
    }
}

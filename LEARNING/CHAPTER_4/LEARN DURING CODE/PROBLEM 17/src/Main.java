import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER: ");
        int num1 = input.nextInt();
        System.out.println("ENTER SECOND NUMBER: ");
        int num2 = input.nextInt();
        System.out.println("ENTER THIRD NUMBER: ");
        int num3 = input.nextInt();
        if (num1>num2)
        {
            if (num1>num3)
            {
                System.out.print(num1);
                System.out.println(" IS GREATER NUMBER.");
            }
            else {
                System.out.print(num3);
                System.out.println(" IS GREATER NUMBER");
            }
        }
        else if (num2>num1)
        {
            if (num2>num3)
            {
                System.out.print(num2);
                System.out.println(" IS GREATER NUMBER.");
            }
            else {
                System.out.print(num3);
                System.out.println(" IS GREATER NUMBER");
            }
        }
    }
}
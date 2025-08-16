import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A DECIMAL NUMBER: ");
        float num1 = input.nextFloat();
        System.out.println("ENTER A ANOTHER DECIMAL NUMBER: ");
        float num2 = input.nextFloat();
        float multiply = num1*num2;
        System.out.print("THE MULTIPLY OF " + num1 + " AND " + num2 + " is: " + multiply);
    }
}
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER: ");
        int num1 = input.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int num2 = input.nextInt();
        System.out.println("RESULT OF BITWISE XOR OF BOTH THE NUMBER ENTERED BY YOU ");
        int num3 =num1^num2;
        System.out.println(num3);
    }
}
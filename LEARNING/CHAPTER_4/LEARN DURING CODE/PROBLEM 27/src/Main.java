import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER: ");
        int num1 = input.nextInt();
        System.out.print("RESULT OF NUMBER IS EVEN/ODD: ");
        int num3 = num1&1;
        if (num3==0) System.out.println("EVEN");
        else System.out.println("ODD");
    }
}
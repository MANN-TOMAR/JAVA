import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE HEIGHT OF TRIANGLE: ");
        float num1 = input.nextFloat();
        System.out.println("ENTER A ANOTHER DECIMAL NUMBER: ");
        float num2 = input.nextFloat();
        float AREA = (num1*num2)/2;
        System.out.print("THE AREA OF TRIANGLE WHOSE HEIGHT IS: " + num1 + " AND BREATH IS: " + num2 + " is: " + AREA);
    }
}
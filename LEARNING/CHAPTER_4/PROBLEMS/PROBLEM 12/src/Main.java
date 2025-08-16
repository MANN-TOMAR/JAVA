import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("ENTER THE PRINCIPAL AMOUNT: ");
            float P = input.nextFloat();
            System.out.println("ENTER THE TIME IN YEAR: ");
            float T = input.nextFloat();
            System.out.println("ENTER RATE OF INTEREST: ");
            float R = input.nextFloat();
            float SIMPLE_INTEREST = (P*R*T)/100;
            System.out.print("THE SIMPLE INTEREST WHEN PRINCIPAL AMOUNT IS: " + P + " AND RATE OF INTEREST IS: " + R + " AND TIME OF INTEREST IS: " + T+ "=> "+SIMPLE_INTEREST);
        }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER LENGTH OF RECTANGLE NUMBER: ");
        int num1 = input.nextInt();
        System.out.println("ENTER BREATH OF RECTANGLE NUMBER: ");
        int num2 = input.nextInt();
        int PERIMETER = (num1+num2)*2;
        System.out.print("THE PERIMETER OF RECTANGLE WHOSE SIDES ARE: " + num1 + " AND " + num2 + " is: " + PERIMETER);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER: ");
        int num = input.nextInt();
        System.out.println("RESULT OF BITWISE (NOT)COMPLIMENT OF BOTH THE NUMBER ENTERED BY YOU ");
        int num1 = ~num;
        System.out.println(num1);
    }
}
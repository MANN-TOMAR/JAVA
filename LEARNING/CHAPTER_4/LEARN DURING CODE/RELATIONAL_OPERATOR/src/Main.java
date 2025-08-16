import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER YOUR AGE: ");
        int age = input.nextInt();
        if (age>=18) System.out.println("YOU ARE ELIGIBLE FOR DRIVING LICENCE.");
        else  System.out.println("YOU ARE NOT ELIGIBLE FOR DRIVING LICENCE.");
    }
}
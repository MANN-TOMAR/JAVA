import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR AGE: ");
        int age = input.nextInt();
        System.out.println("ARE YOU A MALE(true/false): ");
        boolean gender = input.nextBoolean();
        if (age<5) System.out.println("YOU HAVE A DISCOUNT OF 75%.");
        else if (!gender) System.out.println("YOU HAVE DISCOUNT OF 50%.");
        else if (age>60 && gender) System.out.println("YOU HAVE A DISCOUNT OF 25%.");
        else System.out.println("YOU HAVE A DISCOUNT OF 0%.");
        }
}
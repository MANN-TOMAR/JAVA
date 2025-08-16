import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A YEAR: ");
        int yy = input.nextInt();
        if (yy%4==0) System.out.println("YEAR IS LEAP YEAR.");
        else System.out.println("YEAR IS NOT LEAP YEAR.");
    }
}
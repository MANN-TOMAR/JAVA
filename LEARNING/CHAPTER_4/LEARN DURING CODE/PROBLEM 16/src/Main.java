import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int num = input.nextInt();
        if (num%2==0) System.out.println("NUMBER IS EVEN.");
        else System.out.println("NUMBER IS ODD");
    }
}
import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int num = input.nextInt();
        if (num<0) System.out.println("NUMBER IS NEGATIVE");
        else if (num>0) System.out.println("NUMBER IS POSITIVE");
        else System.out.println("NUMBER IS ZERO");
    }
}
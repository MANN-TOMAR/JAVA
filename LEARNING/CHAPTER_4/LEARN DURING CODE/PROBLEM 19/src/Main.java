import jdk.jfr.Percentage;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR PERCENTAGE: ");
        int percentage = input.nextInt();
        if (percentage>=90 && percentage<=100) System.out.println("YOUR GRADE IS 'A'.");
        else if (percentage>=75 && percentage<90) System.out.println("YOUR GRADE IS 'B'.");
        else if(percentage>=60 && percentage<75) System.out.println("YOUR GRADE IS 'C'.");
        else if(percentage>=30 && percentage<60) System.out.println("YOUR GRADE IS 'D'.");
        else if(percentage<30) System.out.println("YOUR GRADE IS 'F'.");
        else System.out.println("INAPROPRIATE PERCENTAGE.");
    }
}
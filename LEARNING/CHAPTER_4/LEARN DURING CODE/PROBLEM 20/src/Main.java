import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR AGE: ");
        int age = input.nextInt();
        if (age>=60) System.out.println("YOU ARE A SENOIR CITIZEN.");
        else if(age<60 && age>=20) System.out.println("YOU ARE A ADULT CITIZEN.");
        else if(age<20 && age>=13) System.out.println("YOU ARE A TEENAGER CITIZEN.");
        else System.out.println("YOU ARE A CHILD CITIZEN.");
    }
}
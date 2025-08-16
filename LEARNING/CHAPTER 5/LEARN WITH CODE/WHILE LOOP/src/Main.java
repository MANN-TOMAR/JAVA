import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        int num = input.nextInt();
        int a=1;
        while (a<=10)
        {
            System.out.println(num+" X "+a+" = "+num*a);
            a++;
        }
    }
}
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER YOUR NAME: ");
        String name = scanner.nextLine();
        System.out.println("WELCOME " + name + " TO KGCODING");

        System.out.println("ENTER TWO NUMBERS: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum =num1+num2;
        System.out.print("THE SUM OF "+num1+" AND "+num2+" IS "+sum);
    }
}
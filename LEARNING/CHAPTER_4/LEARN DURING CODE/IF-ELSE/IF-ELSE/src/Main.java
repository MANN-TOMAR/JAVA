import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME: ");
        String name = input.nextLine();
        Boolean isMale =false;
        if (isMale) System.out.println("WELCOME, Mr."+name);
        else System.out.println("WELCOME, Ms."+name);
    }
}
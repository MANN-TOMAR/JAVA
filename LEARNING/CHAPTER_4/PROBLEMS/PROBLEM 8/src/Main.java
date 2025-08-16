import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER: ");
        int num1 = input.nextInt();
        System.out.println("ENTER SECOND NUMBER: ");
        int num2 = input.nextInt();
        int sum =num2+num1;
        int sub =num1-num2;
        int multiply = num1*num2;
        int division = num1/num2;
        int remainder = num1%num2;
        System.out.println("ADDITION OF "+num1+" AND "+num2+" is: "+sum);
        System.out.println("SUBSTRACTION OF "+num1+" AND "+num2+" is: "+sub);
        System.out.println("MULTIPLY OF "+num1+" AND "+num2+" is: "+multiply);
        System.out.println("DIVISION OF "+num1+" BY "+num2+" is: "+division);
        System.out.println("REMAINDER OF "+num1+" WHEN IT DIVIDE BY "+num2+" is: "+remainder);
    }
}
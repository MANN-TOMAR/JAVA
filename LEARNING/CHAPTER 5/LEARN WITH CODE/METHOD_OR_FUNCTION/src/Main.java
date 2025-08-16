import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER: ");
        int num1 = input.nextInt();
        System.out.println("ENTER SECOND NUMBER: ");
        int num2 = input.nextInt();
        System.out.println("SUM IS: "+add(num1,num2));
    }
    public static int add(int n1, int n2)
    {
        int sum;
        sum=n1+n2;
        return sum;
    }
}
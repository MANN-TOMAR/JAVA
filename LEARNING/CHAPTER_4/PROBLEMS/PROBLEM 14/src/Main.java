import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER TEMPERATURE IN °F: ");
        float FEHRANITE = input.nextFloat();
        float CELCIUS = (FEHRANITE-32)*5/9;
        System.out.println("TEMPERATURE IN °C IS: "+CELCIUS);
    }
}
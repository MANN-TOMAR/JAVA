//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int k = 5; k >= 0; k--) {
            for (int l = k; l >= 0; l--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int m = 1; m <= 5; m++) {
            for (int n = 5-m; n >= 0; n--) {
                System.out.print(" ");
            }
            for (int o = m ; o > 0 ; o--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
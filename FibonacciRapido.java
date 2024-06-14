import java.util.Locale;
import java.util.Scanner;

public class FibonacciRapido {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double num = ((Math.pow(((1+Math.sqrt(5))/2),n))-(Math.pow(((1-Math.sqrt(5))/2),n)))/Math.sqrt(5);
        System.out.printf("%.1f\n",num);
    }
}

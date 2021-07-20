import java.util.Scanner;

public class Q8FahnDeg {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celcius");
        double C = sc.nextDouble();
        double F = (((9 * C) / 5) + 32);

        System.out.println("Temperature in Fahrenheit is " + F);
        sc.close();
    }
}
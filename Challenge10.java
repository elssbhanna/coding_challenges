import java.util.Scanner;

public class Challenge10
{
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int squared = number * number;
        int cubed = squared * number;
        int fourth = cubed * number;
        System.out.println("Number: " + number);
        System.out.println("Squared: " + squared);
        System.out.println("Cubed: " + cubed);
        System.out.println("Fourth: " + fourth);
    }
}

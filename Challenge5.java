import java.util.Scanner;

public class Challenge5
{
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 and 10");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number > 5) {
            System.out.println("Higher than 5");
        } else if (number <= 5) {
            System.out.println("5 or below");
        }
    }
}

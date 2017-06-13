import java.util.Scanner;

public class Challenge11
{
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number > 0) {
            System.out.println("Positive: " + number);
        } else {
            System.out.println("Negative: " + number);  
        }
    }
}

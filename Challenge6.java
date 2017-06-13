import java.util.Scanner;

public class Challenge6
{
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");            
        }
    }
}

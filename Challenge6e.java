import java.util.Scanner;

public class Challenge6e
{
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        try {
            int number = input.nextInt();
            if(number % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");            
            }
        } catch(Exception e) {
            System.out.println("Not a valid number");
            e.printStackTrace();
        }
    }
}

import java.util.Scanner;

public class Challenge4e
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter distance: ");
        int distance = input.nextInt();
        System.out.println("Enter time: ");
        int time = input.nextInt();
        int speed = distance / time;
        System.out.println("Speed : " + speed);
    }
}

import java.util.Scanner;

public class Challenge4
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time: ");
        int time = input.nextInt();
        System.out.println("Enter speed: ");
        int speed = input.nextInt();
        int distance = time * speed;
        System.out.println("Distance: " + distance);
    }
}

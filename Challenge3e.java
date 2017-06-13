import java.util.Scanner;

public class Challenge3e {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        int height = input.nextInt();
        System.out.println("Enter width: ");
        int width = input.nextInt();
        System.out.println("Enter depth: ");
        int depth = input.nextInt();
        int area = height * width * depth;
        System.out.println("Cuboid volume: " + area);
    }
}
import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height: ");
        int height = input.nextInt();
        System.out.println("Enter width: ");
        int width = input.nextInt();
        int area = height * width;
        System.out.println("Rectangle area: " + area);
    }
}

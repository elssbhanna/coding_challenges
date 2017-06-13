import java.util.Random;

public class Challenge14
{
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        for(int i = 0;i < numbers.length;i++) {
            numbers[i] = rand.nextInt(100)+1;
            // not required
            System.out.println("Random #" + (i+1) + " " + numbers[i]);
        }
        
        int sum = 0;
        for(int i = 0;i < numbers.length;i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Total: " + sum);
        // note: to suppress integer division, one of the
        // numbers must be float, hence the cast
        float average = sum / (float)numbers.length;
        System.out.println("Average: " + average);
    }
}

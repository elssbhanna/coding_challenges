public class Challenge13
{
    public static void main(String[] args) {
        int[] numbers = { 1,2,3,4,5,6,7,8,9,10 };
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

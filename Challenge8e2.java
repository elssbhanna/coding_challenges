import java.util.Scanner;
import java.util.Random;

public class Challenge8e2
{
   public static void main(String[] args) {
       int[] cylinder = {0,0,0,0,0,0};
       Random rand = new Random();
       cylinder[rand.nextInt(5)] = 1;
       
       Scanner input = new Scanner(System.in);
       while(true) {
           System.out.println("Enter a number between 1 and 6");
           int choice = input.nextInt();
           if(cylinder[choice-1] == 1) {
               System.out.println("Bang!");
               break;
           } else {
               System.out.println("Click");
           }
       }
   }
}

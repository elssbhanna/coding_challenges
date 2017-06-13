import java.util.Scanner;

public class Challenge8
{
   public static void main(String[] args) {
       int[] cylinder = {0,1,0,0,0,0};
       
       Scanner input = new Scanner(System.in);
       while(true) {
           System.out.println("Enter a number between 1 and 6");
           int choice = input.nextInt();
           if(cylinder[choice-1] == 1) {
               System.out.println("Bang!");
           } else {
               System.out.println("Click");
           }
       }
   }
}

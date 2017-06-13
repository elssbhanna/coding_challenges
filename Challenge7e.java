import java.util.Scanner;

public class Challenge7e
{
    public static void main(String[] args) {
        System.out.println("Enter rock, paper or scissors");
        Scanner input = new Scanner(System.in);
        String choice = input.next();
        if(choice.equalsIgnoreCase("rock")) {
            System.out.println("Rock: loses to paper, beats scissors");
        } else if(choice.equalsIgnoreCase("paper")) {
            System.out.println("Paper: loses to scissors, beats rock");
        } else if(choice.equalsIgnoreCase("scissors")) {
            System.out.println("Scissors: loses to rock, beats paper");
        }
    }
}

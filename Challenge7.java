import java.util.Scanner;

public class Challenge7
{
    public static void main(String[] args) {
        System.out.println("Enter rock, paper or scissors");
        Scanner input = new Scanner(System.in);
        String choice = input.next();
        if(choice.equals("rock")) {
            System.out.println("Rock: loses to paper, beats scissors");
        } else if(choice.equals("paper")) {
            System.out.println("Paper: loses to scissors, beats rock");
        } else if(choice.equals("scissors")) {
            System.out.println("Scissors: loses to rock, beats paper");
        }
    }
}

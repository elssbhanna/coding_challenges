import java.util.Random;

public class Challenge15
{
    public static void main(String[] args) {
        Random rand = new Random();
        int headsTotal = 0;
        
        for(int i = 1;i < 101;i++) {
            int coin = rand.nextInt(2)+1;
            // not required
            if(coin == 1) { // heads
                headsTotal++;
            } 
        }
        float headsAverage = headsTotal / 100f;
        int tailsTotal = 100 - headsTotal;
        float tailsAverage = tailsTotal / 100f;
        System.out.println("Heads average: " + headsAverage);
        System.out.println("Tails average: " + tailsAverage);
    }
}

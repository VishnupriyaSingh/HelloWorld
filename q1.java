import java.util.Scanner;

public class q1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int flips = 0;
        boolean validInput = false;

        while (!validInput) 
        {
            System.out.print("Enter the number of times to flip the coin: ");
            flips = scanner.nextInt();

            if (flips <= 0) 
            {
                System.out.println("Please enter a positive integer.");
            } 
            else 
            {
                validInput = true;
            }
        } 

        int heads = 0;
        for (int i = 0; i < flips; i++) 
        {
            if (Math.random() < 0.5) 
            {
                heads++;
            }
        }

        double headsPercentage = (double) heads / flips * 100;
        double tailsPercentage = 100 - headsPercentage;

        System.out.printf("Heads: %.2f%%, Tails: %.2f%%\n", headsPercentage, tailsPercentage);

        scanner.close();
    }
}

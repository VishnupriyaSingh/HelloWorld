import java.util.Scanner;

public class q4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int N=0;
        boolean validInput = false;
        
        while (!validInput) 
        {
            System.out.print("Enter the harmonic value N: ");
            N = scanner.nextInt();

            if (N == 0) 
            {
                System.out.println("Please enter a non-zero integer.");
            } 
            else 
            {
                validInput = true;
            }
        } 

        double harmonic = 0.0;
        for (int i = 1; i <= Math.abs(N); i++) 
        {
            harmonic += 1.0 / i;
        }

        if(N < 0)
        {
            harmonic *= -1;
        }

        System.out.println("The " + N + "th Harmonic Number is: " + harmonic);

        scanner.close();
    }
}

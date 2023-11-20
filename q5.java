import java.util.Scanner;

public class q5 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its prime factors: ");
        long N = scanner.nextLong();

        if(N == 1)
        {
            System.out.println("1 has no prime factors.");
        }

        while (N % 2 == 0) 
        {
            System.out.print(2 + " ");
            N /= 2;
        }

        for (long i = 3; i <= Math.sqrt(N); i += 2) 
        {
            while (N % i == 0) {
                System.out.print(i + " ");
                N /= i;
            }
        }

        if (N > 2) 
        {
            System.out.print(N);
        }

        scanner.close();
    }
}

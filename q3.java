public class q3 
{
    public static void main(String[] args) 
    {
        if (args.length < 1) 
        {
            System.out.println("Please provide a power value N as a command-line argument.");
            return;
        }

        int N;
        N = Integer.parseInt(args[0]);
        if (N < 0 || N >= 31) 
        {
            System.out.println("Please enter a value for N between between 0 and 30.");
            return;
        }
        
        for (int i = 0; i <= N; i++) 
        {
            System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
        }
    }
}

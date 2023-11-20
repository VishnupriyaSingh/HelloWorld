import java.util.Scanner;

public class q2 
{
    public static boolean isLeapYear(int year) 
    {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        boolean validInput = false;

        while (!validInput) 
        {
            System.out.print("Enter a 4 digit year: ");
            year = scanner.nextInt();

            if (year < 1000 || year > 9999) 
            {
                System.out.println("Please enter a 4 digit year");
            } 
            else 
            {
                validInput = true;
            }
        }

        if (isLeapYear(year)) 
        {
            System.out.println(year + " is a Leap Year.");
        } 
        else 
        {
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close();
    }
}

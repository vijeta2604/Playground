import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int i,temp=num/2;
        if (checkPrime(num)) {
            System.out.println(num + " is a prime number");
        }
        else
        {
            System.out.println(num + " is not a prime number");
        }
    }
    public static boolean checkPrime(int temp)
    {
        if (temp <= 1)
        {
            return false;
        }
        for (int i = 2; i <temp; i++)
        {
            if (temp % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}

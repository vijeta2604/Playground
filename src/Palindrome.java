import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String name = "RADARP";
        String reverseStr="";
        int strLength = name.length();

        for (int i = (strLength - 1); i >=0; i--) {
            reverseStr = reverseStr + name.charAt(i);
        }
        if (name.toUpperCase().equals(reverseStr.toUpperCase())) {
            System.out.println(name + " is a Palindrome String.");
        }
        else {
            System.out.println(name + " is not a Palindrome String.");
        }

    }
}
import java.util.Scanner;

public class Reverse_String {
    public static void main(String[]args) {
        System.out.println("Enter the string :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversedStr = "";
        String []s = str.split(" ");////Breaking the sentence into words

        for (int i = 0; i < s.length; i++) {
            System.out.println("Reversed string upar wala : "+ reversedStr);
            //reversedStr = str.charAt(i)+ reversedStr;
            reversedStr = s[i] + " " + reversedStr;
            System.out.println("Reversed string niche wala: "+ reversedStr);
        }

        System.out.println("Reversed string: "+ reversedStr);
        //System.out.println();
    }
}

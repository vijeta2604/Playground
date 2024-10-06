import java.util.Scanner;

public class Char_count {
    public static void main(String[]args){
        System.out.println("Enter the string :" );
        Scanner sc= new Scanner(System.in);
        String str  = sc.nextLine();
        //String str=" ";
        int count =0;

        for (int i =0; i<str.length();i++){
            if(str.charAt(i)!=' ')//checking space
                count++;
        }
        System.out.println("Total char in string " +count);
    }
}

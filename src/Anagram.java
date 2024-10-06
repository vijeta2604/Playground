import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[]args){

        System.out.println("Taking input from user");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = sc.next();
        System.out.println("Enter first string:");
        String str2 = sc.next();
        boolean isAnagram = true;
        if (str1.length()==str2.length()){
            char[]string1=str1.toCharArray();
            for(int i = 0; i < str1.length(); i++){
                int index = str2.indexOf(string1[i]);
                if(index <0) {
                    isAnagram =false;
                    break;
                }
            }
            if (isAnagram){
                System.out.println("Both strings are Anagram");
            } else {
                System.out.println("Both the strings are not anagram");
            }
        }
   }
}

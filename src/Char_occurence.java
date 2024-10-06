import java.util.HashMap;
import java.util.Scanner;

public class Char_occurence {
    public static void main(String[]args){
        System.out.println("Enter the string :" );
        Scanner sc= new Scanner(System.in);
        String str  = sc.nextLine();
        str=str.replaceAll(" ","");
        //int count =0;
        HashMap<Character,Integer>Charcount=new HashMap<>();
        for (int i=0;i<str.length();i++){
            if(Charcount.containsKey(str.charAt(i))){
                int count = Charcount.get(str.charAt(i));
                Charcount.put(str.charAt(i),++count);
            }
            else {
                Charcount.put(str.charAt(i),1);
            }
        }
        System.out.println(Charcount);
    }
}

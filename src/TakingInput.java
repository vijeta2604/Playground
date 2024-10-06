
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc=new Scanner(System.in);
        //boolean a =sc.hasNextInt();
       // int a =sc.nextInt();
        System.out.println("enter value 1");
        float f=sc.nextFloat();
        System.out.println("enter value 2");
        float g=sc.nextFloat();
        float sum = f+g;
        System.out.println(sum);
    }

}

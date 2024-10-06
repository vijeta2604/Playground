//
import java.util.Scanner;
public class Problem_8 {
    public static void main(String[] args) {
        int m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks in physics:");
        m1= sc.nextInt();
        System.out.println("Enter your marks in chemistry:");
        m2= sc.nextInt();
        System.out.println("Enter your marks in Maths:");
        m3= sc.nextInt();
        float avg = (m1+m2+m3)/3f;
        System.out.println("your overall percentage " +avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33  ){
            System.out.println("Congrats you are promoted! ");
        }
        else{
            System.out.println(" you are not promoted");
        }
    }
}

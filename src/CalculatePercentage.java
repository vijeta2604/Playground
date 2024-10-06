import java.util.Scanner;
public class CalculatePercentage {
    public static void main(String[] args) {
        System.out.println("Enter the marks of five subjects: ");
        Scanner sc=new Scanner(System.in);
        int sub1 =sc.nextInt();
        int sub2 =sc.nextInt();
        int sub3=sc.nextInt();
        int sub4=sc.nextInt();
        int sub5=sc.nextInt();
        int sum =sub1+sub2+sub3+sub4+sub5;
        System.out.println(sum);
        float percentage=((float) sum /500)*100;
        System.out.println(percentage);

    }
}

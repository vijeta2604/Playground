import java.util.Scanner;
public class Else_if {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        int age;
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age>50){
            System.out.println("you are experienced !");
        } else if (age>40) {
            System.out.println("you are Semi-experienced !");

        } else if (age>30) {
            System.out.println("you are Semi-Semi experienced !");

        } else  {
            System.out.println("you are not experienced");

        }
    }
}

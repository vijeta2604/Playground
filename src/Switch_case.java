import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("Enjoy college!");
                break;

            case 24:
                System.out.println("Get job");
                break;

            case 50:
                System.out.println("Get Retired");
                break;
            default:
                System.out.println("Enjoy your life");

        }
    }
}

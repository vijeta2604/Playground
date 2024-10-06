import java.util.Scanner;
public class website {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String site = sc.next();
        if(site.endsWith(".com")){
            System.out.println("It is commercial website");
        } else if (site.endsWith(".org")) {
            System.out.println("it is organisational website");
            
        } else if (site.endsWith(".in")) {
            System.out.println("it is Indian website");
            
        }
    }
}

import java .util.Scanner;
public class Income_tax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println(" Enter your salary lakh per annum :");
        //income = sc.nextFloat();
        float tax=0;
        float income =3.9f;
        income = sc.nextFloat();
        System.out.println(income);
        if (income<=2.5){
            tax= tax+0;


        } else if (income>=2.5 && income<=5.0) {
            tax=tax+(float)(0.05*(income-2.5));

        } else if (income>=5.0 && income<=10.0) {
            tax=tax+(float)(0.2*(income-5.0));

        }
        System.out.println(" Tolal tax paid by employee:"  +tax);
    }
}

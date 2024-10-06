public class Logical {
    public static void main(String[] args) {
        System.out.println("for logical AND operator :");
        boolean a= true;
        boolean b=true;
        boolean c=true;
        if(a && b && c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("for logical OR operator :");
        boolean a1= false;
        boolean b1=false;
        if(a1||b1){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("for logical NOT operator :");
        boolean a2= true;
        boolean b2=false;
        System.out.println(!a2);
        System.out.println(!b2);
    }
}

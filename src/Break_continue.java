//public class Break_continue {
//    public static void main(String[] args) {
//        for (int i=0;i<=5;i++){
//            System.out.println(i);
//
//            if(i==3){
//                System.out.println("End the loop");
//                break;
//            }
//
//        }
//    }
//}
//#For continue

public class Break_continue {
    public static void main(String[] args) {
        for (int i=0;i<=5;i++){


            if(i==3){
                System.out.println("End the loop");
                continue;
            }
            System.out.println(i);
        }
    }
}

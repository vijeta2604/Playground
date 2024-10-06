import java.util.Arrays;

public class Remove_dublicate {
    public static void main(String[]args){
        int arr[]={7,2,4,1,7,1};
        int length= arr.length;
        int temp[]=new int[arr.length];
        int j=0;
        for(int i=0;i<length-1;i++){
            int index = Arrays.binarySearch(temp, arr[i]);
//            if(){
//                temp[j]=arr[i];
//                System.out.println(temp[j]+"");
//            }
        }

    }
}

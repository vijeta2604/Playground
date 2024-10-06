import java.util.ArrayList;
import java.util.List;

public class Linear_Search {
    public static void main(String []args){
        int[] arr= {10,20,30,50,70, 50, 20, 90};
        //int target = 50;
        List<Integer> temp = new ArrayList<>();

        for(int i=0; i<=arr.length - 1; i++) {
            int index = linearSearch(temp, arr[i]);

            if (index < 0) {
               temp.add(arr[i]) ;
            }
        }
        System.out.println("Hello world");
        System.out.println(temp);
    }
    public static int linearSearch(List<Integer> arr, int target){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == target){
                return i;
            }
        }
        return -1;
    }
}

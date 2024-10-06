import java.util.Arrays;

public class Binary_Search {
    public static void main(String[]args){
        int[]array={5,9,3,1,6,8,2,4};
        Arrays.sort(array);
        int key=8;
        System.out.println(binarysearch(array,key));
    }
    public static int binarysearch(int[]array,int key){
        int low=0, mid=0,high= array.length-1;
        while (low<=high){
            mid=(low+high)/2;
            if(key==array[mid]){
                return mid;
            } else if (key<array[mid]) {
                high=mid-1;
                low=low;
            }
            else {
                high=high;
                low=mid+1;
            }
        }
        return -1;
    }
}

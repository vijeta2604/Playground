import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_array {
    public static void main(String[]args){
        int[]a1={1,2,3,4,5};
        int[]a2={7,8,9,4};
        List<Integer> list= new ArrayList<>();
        for(int i=0; i<a1.length; i++) {
           list.add(a1[i]);
        }
        for(int j=0; j<a2.length; j++) {
            list.add(a2[j]);
        }
        System.out.println(list);
        int sum = 0;
        int k;
        for (k = 0; k <list.size(); k++)
            sum += list.get(k);
        System.out.println(sum);
    }


}



import java.util.HashMap;

public class Hashmap {
    public static void main(String[]args){
        HashMap<String , Integer>population = new HashMap<>();//country(Key),population(value)

        population.put("India",32);
        population.put("china",87);
        population.put("Africa",65);
        System.out.println(population);
        population.put("India",100);
        System.out.println(population);

        //Search
        if(population.containsKey("India")){
            System.out.println("key is present ");
        }
        else {
            System.out.println("key is not present");
        }
        System.out.println(population.get("china"));
        System.out.println(population.get("Bali"));


        //for loop
       int arr[]={1,2,3};
       for (int i=0;i<3;i++){
           System.out.println(arr[i]+ " ");
        }

       //in hashmap
        for (int val:arr){
            System.out.println(val+ " ");
        }
    }
}

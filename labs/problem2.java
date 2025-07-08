import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,2,6,3,5,1,4,5,7,4,3,1,2,3};

         HashMap<Integer,Integer> map = new HashMap<>();

         for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
         }

         for(Map.Entry<Integer,Integer> entry : map.entrySet()){
             
                System.out.println(entry.getKey()+"-"+entry.getValue());
         }
    }
}
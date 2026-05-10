import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 2,3, 1};
        int ans = 0;
        for (int i : array1){
            ans ^= i;
        }
//        Set<Integer> numbs= new HashSet<>();
//        for(int i:array1){
//            if(!numbs.add(i)){
//                numbs.remove(i);
//            }
//        }
//        if(!numbs.isEmpty()) {
//            System.out.println(numbs.iterator().next());
//        } else {
//            System.out.println("No Unique element");
//        }

//        Object[] array= numbs.toArray();
//        System.out.println(array[0]);
        System.out.println(ans);
    }
}
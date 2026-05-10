import java.util.*;


public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] resultList = topKFrequent(nums, k);
        System.out.println(Arrays.toString(resultList));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int i = 0;
        Map<Integer, Integer> freqmap = new HashMap<>();
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> freqmap.get(a) - freqmap.get(b));
        int[] result = new int[k];
        for(int val:nums){
            freqmap.merge(val,1,Integer::sum);
        }
        for (int key: freqmap.keySet()){
            pq.add(key);
            if (pq.size()>k){
                pq.poll();
            }
        }
        while(i<k){
            result[i]=pq.poll();
            i++;
        }
        return result;
    }
}
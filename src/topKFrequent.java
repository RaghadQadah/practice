import java.util.*;

public class topKFrequent {


//    public int[] topKFrequent(int[] nums, int k) {
//        int [] result = new int[k];
//        Map<Integer, Integer> frequencyMap = new HashMap<>();
//        for (int num : nums) {
//            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//        }
//
//        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(Collections.reverseOrder
//                (Map.Entry.comparingByValue()));
//
//        maxHeap.addAll(frequencyMap.entrySet());
//
//        for (int i = 0; i < k ; i++) {
//            result[i] = maxHeap.poll().getKey();
//        }
//        return result;
//    }

    public static int[] topKFrequent(int[] nums, int k) {

        int[] result = new int[k];
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                (Map.Entry.comparingByValue()));

       for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
           minHeap.offer(entry);
           if (minHeap.size() > k) {
               minHeap.poll();
           }
       }
       for (int i = 0; i < k; i++) {
           result[i] = minHeap.poll().getKey();
       }

        return result;
    }



    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println("The " + k + " most frequent elements are " + topKFrequent(nums, k)); // Output: [1, 2]

        int[] nums2 = {1};
        int k2 = 1;
        System.out.println("The " + k2 + " most frequent elements are " + topKFrequent(nums2, k2)); // Output: [1]
    }
}

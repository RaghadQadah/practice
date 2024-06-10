import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;

public class kClosest {

    public static int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a, b) -> ((a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1])));

        for (int i = 0; i < points.length; i++) {
            minHeap.offer(points[i]);
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }


//    public static int[][] kClosest(int[][] points, int k) {
//        // Create a min-heap (PriorityQueue) where elements are ordered by their squared distance to the origin
//        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
//                (a, b) -> Integer.compare(squaredDistance(a), squaredDistance(b))
//        );
//
//        // Add all points to the heap
//        for (int[] point : points) {
//            minHeap.offer(point);
//        }
//
//        // Collect the k closest points
//        int[][] result = new int[k][2];
//        for (int i = 0; i < k; i++) {
//            result[i] = minHeap.poll();
//        }
//
//        return result;
//    }

    // Helper method to calculate the squared distance from the origin
    private static int squaredDistance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 3}, {-2, 2}};
        int k = 1;
        System.out.println("The " + k + "th largest element is " + kClosest(nums, k));
    }
}
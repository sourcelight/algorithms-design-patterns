/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms;

import java.util.PriorityQueue;

/**
 * @see <a href="file:///C:/Users/Riccardo_Bruno/OneDrive%20-%20EPAM/coding_exercises/ds-algo-pointer/10-pattern-two-heaps/2-find-the-median-of-a-number-stream-(medium).html">local reference</a>
 * The insert method in this class levearge the separation of smallest and largest
 * part of the "Stream" on the Priority queues.
 * The priority queues maintain in the head(top) the bigger or smaller value of the queue
 * and the time complexity is O(log(N)).
 * Compared to the insertion sort they don't need to take the full list ordered.
 *
 */
public class MedianNumberOfStream {

    // It contains the smallest part of the list, in he case of odd numbers + 1 element more
    PriorityQueue<Integer> maxHeap;

    // It contains the largest part of the list
    PriorityQueue<Integer> minHeap;


    public MedianNumberOfStream() {
        //I use the comparator interface that is a Functional interface to define max and min heap
        this.maxHeap = new PriorityQueue<>((a, b) -> b - a);
        this.minHeap = new PriorityQueue<>((a, b) -> a - b);
    }


    public void insertNum(int num) {
        //In the first case of insert
        if (maxHeap.isEmpty() || maxHeap.peek() > num) {
            maxHeap.add(num);
        } else if (num > maxHeap.peek()) {
            minHeap.add(num);
        }
        //I need to balance the insertions(in the max heap no more than one element)
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        }
        if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }

    public float findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (minHeap.peek() + maxHeap.peek()) / 2.0f;
        }
        return maxHeap.peek();
    }
}
